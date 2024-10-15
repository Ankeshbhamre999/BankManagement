package my.app.service;

import org.springframework.stereotype.Service;

import my.app.entity.Account;

@Service
public interface AccountService

{
	public String CreateAccount( Account account);
	
	public Account getAccountDetiaByAccountNumberl(Long  account_Number);
	


}
