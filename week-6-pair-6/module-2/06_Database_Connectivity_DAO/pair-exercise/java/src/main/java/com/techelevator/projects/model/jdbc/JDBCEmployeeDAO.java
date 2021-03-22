package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.interfaces.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	
	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> employees = new ArrayList<Employee>();
		
		
		String query = "SELECT employee_id\r\n" + 
				"        , department_id\r\n" + 
				"        , first_name\r\n" + 
				"        , last_name\r\n" + 
				"FROM employee;";

		SqlRowSet rows = jdbcTemplate.queryForRowSet(query);
		
		while(rows.next())
		{
			
			long employeeId = rows.getLong("employee_id");
			long departmentId = rows.getLong("department_id");
			String firstName = rows.getString("first_name");
			String lastName = rows.getString("last_name");
			
			
			
			
			Employee employee = new Employee();
			employee.setId(employeeId);
			employee.setDepartmentId(departmentId);
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			
					
			employees.add(employee);
		}
		
		// return the results
		return employees;	
		
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) 
	{
		List<Employee> employees = new ArrayList<Employee>();
		
		
		String query = 
				"SELECT first_name\r\n" + 
				"        , last_name\r\n" + 
				"FROM employee\r\n" + 
				"WHERE first_name = ?\r\n" + 
				"        AND last_name = ?;";

		SqlRowSet rows = jdbcTemplate.queryForRowSet(query, firstNameSearch, lastNameSearch);
		
		while(rows.next())
		{
			
			
			String firstName = rows.getString("first_name");
			String lastName = rows.getString("last_name");
			
			
			
			Employee employee = new Employee();
			
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
					
			employees.add(employee);
		}
		
		// return the results
		return employees;	
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		
		String query = 
				"SELECT first_name\r\n" + 
				"        , last_name\r\n" + 
				"        , department_id\r\n" + 
				"FROM employee\r\n" + 
				"WHERE department_id = ?;";

		SqlRowSet rows = jdbcTemplate.queryForRowSet(query, id);
		
		while(rows.next())
		{
			
			
			String firstName = rows.getString("first_name");
			String lastName = rows.getString("last_name");
			Long departmentId = rows.getLong("department_id");
			
			
			Employee employee = new Employee();
			
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setDepartmentId(departmentId);		
			employees.add(employee);
		}
		
		// return the results
		return employees;	
		
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() 
	{
		List<Employee> employees = new ArrayList<Employee>();
		
		
		String query = 
				"\r\n" + 
				"SELECT employee_id\r\n" + 
				"        , department_id\r\n" + 
				"        , first_name\r\n" + 
				"        , last_name\r\n" + 
				"FROM employee\r\n" + 
				"WHERE employee_id NOT IN (SELECT DISTINCT employee_id FROM project_employee);";

		SqlRowSet rows = jdbcTemplate.queryForRowSet(query);
		
		while(rows.next())
		{
			
			Long employeeId = rows.getLong("employee_id");
			String firstName = rows.getString("first_name");
			String lastName = rows.getString("last_name");
			Long departmentId = rows.getLong("department_id");
			
			Employee employee = new Employee();
			
			employee.setId(employeeId);
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setDepartmentId(departmentId);		
			employees.add(employee);
		}
		
		// return the results
		return employees;	
		
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) 
	{
		List<Employee> employees = new ArrayList<Employee>(); 
		
		
		String query = 
				"SELECT e.employee_id\r\n" + 
				"        , e.department_id\r\n" + 
				"        , e.first_name\r\n" + 
				"        , e.last_name\r\n" + 
				"        , pe.project_id\r\n" + 
				"FROM project_employee as pe\r\n" + 
				"INNER JOIN employee as e\r\n" + 
				"        ON e.employee_id = pe.employee_id\r\n" + 
				"WHERE pe.project_id = ?;";

		SqlRowSet rows = jdbcTemplate.queryForRowSet(query, projectId);
		
		while(rows.next())
		{
			
			
			String firstName = rows.getString("first_name");
			String lastName = rows.getString("last_name");
			Long departmentId = rows.getLong("department_id");
			
			Employee employee = new Employee();
			
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setDepartmentId(departmentId);		
			employees.add(employee);
		}
		
		// return the results
		return employees;	
		
	}
	

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) 
	{
	
		String sql = 
				"UPDATE employee\r\n" + 
				"SET department_id = ? \r\n" + 
				"WHERE employee_id = ? ;";

		jdbcTemplate.update(sql
				, departmentId
				, employeeId);
		
	}

}
