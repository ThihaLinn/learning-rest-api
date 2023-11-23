package com.jdc.weekend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.weekend.entity.Account;
import com.jdc.weekend.service.AccountServiceImpl;


@RestController
@RequestMapping("/home")
public class AccountController {
	
	@Autowired
	private AccountServiceImpl service;

	@GetMapping("{id}")
	public Account getAccount(@PathVariable Integer id) {
		return  service.findByAccountId(id);
	}
	
	@GetMapping()
	public List<Account> getAllAccount() {
		return  service.allAccount();
	}
	
	@PostMapping
	public String createAccount(@RequestBody Account account) {
		service.createAccount(account);
		return "create successfully";
	}
	
	@PutMapping
	public String updateAccount(@RequestBody Account account) {
		service.updateAccount(account);
		return "create successfully";
	}
	
	@DeleteMapping("{id}")
	public String updateAccount(@PathVariable Integer id) {
		service.deleteAccount(id);
		return "delete successfully";
	}
	
	
	
}
