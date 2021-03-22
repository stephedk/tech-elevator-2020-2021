package com.techelevator.tenmo.models;

import java.math.BigDecimal;

public class Account {

	private Integer accountId; 
	private Integer userId; 
	private BigDecimal balance; 
	
	public int getUserId() {
		
		return userId; 
	}
	 public void setUserId(Integer id) {
		 
		 this.userId = id; 
	 }
	 
	 public int getAccountId() {
		 
		 return accountId; 
	 }
	 
	 public void setAccountId(Integer id) {
		 
		 this.accountId = id; 
	 }
	 
	 public BigDecimal getBalance() {
		 
		 return balance; 
	 }
	 
	 
	 //not entirely sure the following is correct and/or necessary
	
	 
	 public BigDecimal setBalance(BigDecimal balance) {
		 
		return this.balance = balance; 
	 }
}
