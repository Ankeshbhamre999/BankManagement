package my.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.app.entity.Account;
import my.app.repo.AccountRepository;
import my.app.service.AccountService;
@Repository
public class AccountServiceImpl implements AccountService 
{
	@Autowired
	 private AccountRepository accountrepo;
	@Override
	public String CreateAccount(Account account) 
	{
		accountrepo.save(account);
		
		
		// TODO Auto-generated method stub
		return " User Account is crested";
	}
	
	@Override
	public Account getAccountDetiaByAccountNumberl(Long account_Number) 
	{
		 Optional<Account> opt=accountrepo.findById(account_Number);
		 
		 if(opt.isPresent())
		 {
			 Account account_found=opt.get();
			 return account_found;
		 }
		 return  null;
		 
			 
		// TODO Auto-generated method stub
	
	}
	



}


