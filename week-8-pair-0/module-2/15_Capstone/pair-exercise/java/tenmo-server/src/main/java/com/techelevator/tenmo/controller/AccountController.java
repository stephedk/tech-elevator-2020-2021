package com.techelevator.tenmo.controller;


import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.techelevator.tenmo.dao.AccountDAO;
import com.techelevator.tenmo.dao.UserDAO;
import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.LoginDTO;
import com.techelevator.tenmo.model.RegisterUserDTO;
import com.techelevator.tenmo.model.User;


@RestController
@PreAuthorize("isAuthenticated()")
public class AccountController {
	
	@Autowired
	private AccountDAO accountDAO; 
	@Autowired
	private UserDAO userDAO; 
	
	public AccountController(AccountDAO accountDAO, UserDAO userDAO) {
		
		this.accountDAO = accountDAO; 
		this.userDAO = userDAO; 
	}
	
	@GetMapping()
	public List<Account> getAll (@PathVariable Integer userId){
		
		List<Account> accounts = accountDAO.findAll(userId); 
		return accounts; 
	
	}

	@RequestMapping(path = "balance/{id}", method = RequestMethod.GET)
	public BigDecimal getBalance(@PathVariable int id) {
		BigDecimal balance = accountDAO.getBalance(id);
		return balance;
	}
	
	@RequestMapping(path = "listusers", method = RequestMethod.GET)
	public List <User> listUsers() {
		List <User> users = userDAO.findAll();
		return users;
	}
	
}
	


