package com.techelevator.dao.jdbc;

import com.techelevator.dao.SiteDAO;
import com.techelevator.model.Campground;
import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCSiteDAO implements SiteDAO {

    private JdbcTemplate jdbcTemplate;

    public JDBCSiteDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Site> getSitesThatAllowRVs(int parkId) {
    	
    	List<Site> sites = new ArrayList<>(); 
		
		String query = "SELECT s.site_id\r\n" + 
				"        , s.campground_id\r\n" + 
				"        , s.site_number\r\n" + 
				"        , s.max_occupancy\r\n" + 
				"        , s.accessible\r\n" + 
				"        , s.max_rv_length\r\n" + 
				"        , s.utilities\r\n" + 
				"        , c.park_id\r\n" + 
				"FROM site AS s\r\n" + 
				"JOIN campground AS c\r\n" + 
				"ON s.campground_id = c.campground_id\r\n" + 
				"WHERE max_rv_length != 0\r\n" + 
				"AND c.park_id = ?\r\n" + 
				"ORDER BY c.park_id;  "; 
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(query, parkId);
		
		while (rows.next())
		{
			Site site = mapRowToSite(rows);
			sites.add(site); 
		}
		
		return sites;
    }

    private Site mapRowToSite(SqlRowSet results) {
        Site site = new Site();
        site.setSiteId(results.getInt("site_id"));
        site.setCampgroundId(results.getInt("campground_id"));
        site.setSiteNumber(results.getInt("site_number"));
        site.setMaxOccupancy(results.getInt("max_occupancy"));
        site.setAccessible(results.getBoolean("accessible"));
        site.setMaxRvLength(results.getInt("max_rv_length"));
        site.setUtilities(results.getBoolean("utilities"));
        return site;
    }
}
