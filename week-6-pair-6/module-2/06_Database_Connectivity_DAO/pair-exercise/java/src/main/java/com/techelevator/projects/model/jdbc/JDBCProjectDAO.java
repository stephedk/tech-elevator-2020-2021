package com.techelevator.projects.model.jdbc;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.interfaces.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {
	private JdbcTemplate jdbcTemplate;
	public JDBCProjectDAO(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);   
	}
	
	@Override
	public List<Project> getAllActiveProjects()
	{
		Project theProject = null;
		ArrayList<Project> activeProjects = new ArrayList<>();
		String sqlGetAllActiveProjects = "SELECT project_id, name, from_date, to_date "+
										 "FROM project "+
										 "WHERE from_date IS NOT NULL AND (to_date > ? OR to_date IS NULL);";
		LocalDate today = LocalDate.now();
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllActiveProjects, today);
		while(results.next())
		{
			theProject = new Project();
			theProject.setId(results.getLong("project_id"));
			theProject.setName(results.getString("name"));
			activeProjects.add(theProject);
		}
		
		return activeProjects;
	}
	private Project mapRowToProject(SqlRowSet results) {
		Project theProject; 
		theProject = new Project();
		theProject.setId(results.getLong("project_id"));
		theProject.setName(results.getString("name"));
		
		return theProject;
	}
	
	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId)
	{
		String removeEmployee = "DELETE FROM project_employee\r\n" + 
				"WHERE project_id = ? AND employee_id = ?;"; 
	
		
		jdbcTemplate.update(removeEmployee, projectId, employeeId); 
	}
	
	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId)
	{
		String addEmployee = "UPDATE project_employee\r\n" + 
				"SET project_id = ?\r\n" + 
				"WHERE employee_id = ?;"; 
		
			
		jdbcTemplate.update(addEmployee, projectId, employeeId); 
	}
}
