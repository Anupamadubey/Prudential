package com.prudential.assignment.CarRental.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prudential.assignment.CarRental.Entity.Account;
import com.prudential.assignment.CarRental.Service.AccountService;


@RequestMapping("/accounts/")
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/get/account/{id}")
	public Optional<Account> getAccountById(@PathVariable  int id) {
		return accountService.getAccountById(id);
	}
	
	@GetMapping("/getAll")
	public List<Account> getAccounts(){
		return accountService.getAccounts();
	}
	
	@PutMapping("/update/account/{id}")
	public void updateAccount(@RequestBody Account account, @PathVariable int id) {
		accountService.updateAccount(account,id);
	}
	
	@PostMapping("/create/account")
	public void createAccount(@RequestBody Account account) {
		accountService.createAccount(account);
	}
	
	@DeleteMapping("/delete/account/{id}")
	public void deleteAccount( @PathVariable int id) {
		accountService.deleteAccount(id);
	}
	
}
