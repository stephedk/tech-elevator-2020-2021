package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
	
	
		private String name;
		private String address;
		private String phoneNumber;
		private List <Accountable> accounts = new ArrayList <Accountable>();
		
		@Override
		public int getBalance()
		{
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		// getters
		public String getName()
		{
			return name;
		}
		public String getAddress()
		{
			return address;
		}
		public String getPhoneNumber()
		{
			return phoneNumber;
		}
		public Accountable[] getAccounts()
		{
			return accounts.toArray(new Accountable[0]);
		}
		
		// setters
		public void setName(String name)
		{
			this.name = name;
		}
		public void setAddress(String address)
		{
			this.address = address;
		}
		public void setPhoneNumber(String phoneNumber)
		{
			this.phoneNumber = phoneNumber;
		}
		
		// methods
		
		
		
		public void addAccount(Accountable newAccount)
		{
			accounts.add(newAccount);
		}
		
		public boolean isVip()
		{
			int netWorth = 0;
			for(Accountable account : accounts)
			{
				netWorth += account.getBalance();
			}
					
			if(netWorth >= 25000)	
			{
				return true;
			}
			else return false;
		}
		
	}