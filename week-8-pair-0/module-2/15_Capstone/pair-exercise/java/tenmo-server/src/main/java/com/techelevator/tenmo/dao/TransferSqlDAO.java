package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Component
public class TransferSqlDAO implements TransferDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private AccountDAO accountDAO; 

	@Override
	public List<Transfer> getAllTransfers(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transfer getTransferById(int transactionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendTransfer(int userFrom, int userTo, BigDecimal amount) {
		if (userFrom == userTo) {
			return "You can not send money to your self.";
		}
		if (amount.compareTo(accountDAO.getBalance(userFrom)) == -1 && amount.compareTo(new BigDecimal(0)) == 1) {
			String sql = "INSERT INTO transfers (transfer_type_id, transfer_status_id, account_from, account_to, amount) " + 
					"VALUES (2, 2, ?, ?, ?)";
			jdbcTemplate.update(sql, userFrom, userTo, amount);
			accountDAO.addToBalance(amount, userTo);
			accountDAO.subtractFromBalance(amount, userFrom);		
			return "Transfer successful";
		} else {
			return "Transfer unsuccesful, please try again.";
		}
	}

	@Override
	public String requestTransfer(int userFrom, int userTo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transfer> getPendingRequests(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTransferRequest(Transfer transfer, int statusId) {
		// TODO Auto-generated method stub
		return null;
	}
}
