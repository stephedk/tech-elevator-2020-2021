package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountDAO {

	List<Account> findAll(Integer accountId);
	Account findAccountByUserId(Integer userId); 
	BigDecimal findBalanceByUserId(Integer userId); 
	Account updateBalance(BigDecimal balance); 
	BigDecimal getBalance(Integer userId);
	BigDecimal addToBalance(BigDecimal amountToAdd, int userId);
	BigDecimal subtractFromBalance(BigDecimal amountToSubtract, int userId); 
	
}
