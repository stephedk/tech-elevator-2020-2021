package com.techelevator;

public class CreditCardAccount implements Accountable
{
	
	public int getBalance()
	{
		return -debt;
	}
	
	
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	// constructor
	
	public CreditCardAccount(String accountHolder, String accountNumber)
	{
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.debt = 0;
	}
	
	// getters
	public String getAccountHolder()
	{
		return accountHolder;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public int getDebt()
	{
		return debt;
	}
	
	// methods
	public int pay(int amountToPay)
	{
		debt -= amountToPay;
		return debt;
	}
	
	public int charge(int amountToCharge)
	{
		debt += amountToCharge;
		return debt;
	}
	
	
	
}