package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountSqlDAO implements AccountDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Account> findAll(Integer accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findAccountByUserId(Integer userId) {
		// TODO Auto-generated method stub
		Account account = null; 
		
		String sql = "SELECT account_id\r\n" + 
				"FROM accounts\r\n" + 
				"WHERE user_id = ?;  "; 
		
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, userId); 
		if (row.next()) {
			
			account = mapRowToAccount(row); 
		}
		
		return account; 
	}

	@Override
	public BigDecimal findBalanceByUserId(Integer userId) {
		// TODO Auto-generated method stubAccount account = null; 
		Account account = null; 
		
		String sql = "SELECT balance\r\n" + 
				"FROM accounts\r\n" + 
				"WHERE user_id = ?; "; 
		
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, userId); 
		if (row.next()) {
			
			account = mapRowToAccount(row); 
		}
		
		return account.getBalance(); 
	}

	@Override
	public Account updateBalance(BigDecimal balance) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Account mapRowToAccount(SqlRowSet row) {
		
		Account account = new Account(); 
		
		account.setAccountId(row.getInt("account_id"));
		account.setUserId(row.getInt("user_id"));
		account.setBalance(row.getBigDecimal("balance"));
		return account; 
	}

	@Override
	public BigDecimal getBalance(Integer userId) {
		String sqlString = "SELECT balance FROM accounts WHERE user_id = ?";
		SqlRowSet results = null;
		BigDecimal balance = null;
	try {
		results = jdbcTemplate.queryForRowSet(sqlString, userId);
		if (results.next()) {
		balance = results.getBigDecimal("balance");
		}
	} catch (DataAccessException e) {
		System.out.println("Error accessing your account");
	}
	return balance;
	}
	
	@Override
	public BigDecimal addToBalance(BigDecimal amountToAdd, int userId) {
		Account account = findAccountByUserId(userId);
		BigDecimal newBalance = account.getBalance().add(amountToAdd);
		System.out.println(newBalance);
		String sqlString = "UPDATE accounts SET balance = ? WHERE user_id = ?";
		try {
			jdbcTemplate.update(sqlString, newBalance, userId);
		} catch (DataAccessException e) {
			System.out.println("Error accessing account");
		}
		return account.getBalance();
	}

	@Override
	public BigDecimal subtractFromBalance(BigDecimal amountToSubtract, int userId) {
		Account account = findAccountByUserId(userId);
		BigDecimal newBalance = account.getBalance().subtract(amountToSubtract);
		String sqlString = "UPDATE accounts SET balance = ? WHERE user_id = ?";
		try {
			jdbcTemplate.update(sqlString, newBalance, userId);
		} catch (DataAccessException e) {
			System.out.println("Error accessing account");
		}
		return account.getBalance();
	}
	}
	


