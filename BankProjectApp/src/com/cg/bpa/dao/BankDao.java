package com.cg.bpa.dao;

import com.cg.bpa.dto.Credentials;
import com.cg.bpa.dto.Customer;

public interface BankDao {

	public Customer signIn(String cstId, String cstPass);

	public void deposit(int depositAmount, Customer customer);

	public void withdraw(int withdrawAmount, Customer customer);

	public Customer transfer(int transferAmount, Customer customer, String reciever);

	public String createAccount(String password, String custName,
			String accType);

}
