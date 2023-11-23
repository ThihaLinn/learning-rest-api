package com.jdc.weekend.service;

import java.util.List;

import com.jdc.weekend.entity.Account;

public interface AccountService {

	public String createAccount(Account account);
	public String updateAccount(Account account);
	public String deleteAccount(Integer id);
	public Account findByAccountId(Integer id);
	public List<Account> allAccount();
	
}
