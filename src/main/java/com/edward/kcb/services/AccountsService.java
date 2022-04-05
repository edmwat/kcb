package com.edward.kcb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edward.kcb.models.Account;
import com.edward.kcb.repo.AccountsRepo;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class AccountsService {
	
	private final AccountsRepo accountsRepo;
	
	public List<Account> getClientAccounts(String clientId){
		return accountsRepo.findByClientId(clientId);
	}
	
	public void addNewAccount(Account account) {
		this.accountsRepo.save(account);		
	}
	
	public void deleteAccount(Long accountId) {
		this.accountsRepo.deleteById(accountId);
	}

}
