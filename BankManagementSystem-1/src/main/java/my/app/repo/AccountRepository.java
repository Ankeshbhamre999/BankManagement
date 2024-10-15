package my.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.app.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> 
{
	

}
