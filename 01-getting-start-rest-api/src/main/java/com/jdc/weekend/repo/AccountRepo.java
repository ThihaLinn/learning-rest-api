package com.jdc.weekend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.weekend.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {
	
}
