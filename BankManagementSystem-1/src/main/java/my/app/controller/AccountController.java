package my.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import my.app.entity.Account;
import my.app.service.AccountService;

@RestController
public class AccountController 
{
	@Autowired
	private AccountService  service;
	
	 
	
	@PostMapping("/account")
	public ResponseEntity<String>create( @RequestBody  Account account)
	{
		 String stetus = service.CreateAccount(account)
;		 return new ResponseEntity<>(stetus,HttpStatus.CREATED);
	}
	
	@GetMapping("/account/{id}")
	public ResponseEntity< Account>  GetAccountDetial( @PathVariable  Long Account_number)
	{
		   Account account=service.getAccountDetiaByAccountNumberl(Account_number);
;		  return new ResponseEntity<>(account,HttpStatus.OK);
	}
	

}
