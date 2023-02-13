package com.prudential.assignment.CarRental.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prudential.assignment.CarRental.DAO.AccountRepository;
import com.prudential.assignment.CarRental.Entity.Account;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public Optional<Account> getAccountById(int id) {
		return accountRepository.findById(id);
	}
	
	public List<Account> getAccounts(){
		return accountRepository.findAll();
	}
	
	public void updateAccount(Account account,int id) {
		Optional<Account> current = accountRepository.findById(id);
		if(current!=null) {
			accountRepository.save(account);
		}
		
	}
	
	public void createAccount(Account account) {
		accountRepository.save(account);
	}
	
	public void deleteAccount(int id) {
		accountRepository.deleteById(id);
	}

}
