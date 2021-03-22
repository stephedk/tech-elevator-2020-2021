package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Account {

	private BigDecimal balance; 
	private Integer accountId; 
	private Integer userId; 
	
	public Account() {}
	
	public Account(BigDecimal balance, Integer accountId, Integer userId) {
		
		this.balance = balance; 
		this.accountId = accountId; 
		this.userId = userId; 
	}
	
	public BigDecimal getBalance() {
		
		return balance; 
	}
	
	public void setBalance(BigDecimal balance) {
		
		this.balance = balance; 
	}
	
	public Integer getUserId() {
		
		return userId; 
	}
	
	public void setUserId(Integer userId) {
		
		this.userId = userId; 
	}
	
	public Integer getAccountId() {
		
		return accountId; 
	}
	
	public void setAccountId(Integer accountId) {
		
		this.accountId = accountId; 
	}
}
