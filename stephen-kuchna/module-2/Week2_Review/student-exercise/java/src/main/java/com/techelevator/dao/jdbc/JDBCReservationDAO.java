package com.techelevator.dao.jdbc;

import com.techelevator.dao.ReservationDAO;
import com.techelevator.model.Reservation;
import com.techelevator.model.Site;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCReservationDAO implements ReservationDAO {

    private JdbcTemplate jdbcTemplate;

    public JDBCReservationDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int createReservation(int siteId, String name, LocalDate fromDate, LocalDate toDate) {
    	
    	String newReservation = "INSERT INTO reservation"+ 
    							"	(site_id, name, from_date, to_date)\r\n" + 
    							"VALUES(?, ?, ?, ?);";
		
		jdbcTemplate.update(newReservation, siteId, name, fromDate, toDate);
		
		return siteId; 
		
    }

   
	public List<Reservation> getReservations()
	{
		List<Reservation> reservations = new ArrayList<>();
		
		String reservationList = "SELECT reservation_id\r\n" + 
				"        , site_id\r\n" + 
				"        , name\r\n" + 
				"        , from_date\r\n" + 
				"        , to_date\r\n" + 
				"        , create_date\r\n" + 
				"FROM reservation\r\n" + 
				"WHERE from_date >= current_date + interval '1' month ; "; 
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(reservationList);
		
		while (rows.next())
		{
			Reservation reservation = mapRowToReservation(rows);
			reservations.add(reservation);
		}
		
		return reservations;
	}
    
    
    private Reservation mapRowToReservation(SqlRowSet results) {
        Reservation r = new Reservation();
        r.setReservationId(results.getInt("reservation_id"));
        r.setSiteId(results.getInt("site_id"));
        r.setName(results.getString("name"));
        r.setFromDate(results.getDate("from_date").toLocalDate());
        r.setToDate(results.getDate("to_date").toLocalDate());
        r.setCreateDate(results.getDate("create_date").toLocalDate());
        return r;
    }


}
