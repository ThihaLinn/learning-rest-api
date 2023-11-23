package com.jdc.weekend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.weekend.entity.Account;
import com.jdc.weekend.repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepo repo;

	@Override
	public String createAccount(Account account) {
		repo.save(account);
		return "Success";
	}

	@Override
	public String updateAccount(Account account) {
		repo.save(account);
		return "Success";
	}

	@Override
	public String deleteAccount(Integer id) {
		repo.deleteById(id);
		return "Success";
	}

	@Override
	public Account findByAccountId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Account> allAccount() {
		return repo.findAll();
	}

}
