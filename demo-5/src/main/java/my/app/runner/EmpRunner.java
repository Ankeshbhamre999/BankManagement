package my.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.app.entity.Empolyee;
import my.app.repo.EmpRepository;
@Component
public class EmpRunner implements CommandLineRunner
{
	@Autowired
	private EmpRepository repo;

	@Override
	public void run(String... args) throws Exception
	{
		Empolyee em=new Empolyee(1,"Bharat","Burhanpur");
		repo.save(em);
		System.out.println(em.getClass().getName());
		System.out.println(em);
		System.out.println(repo);
		
		 
		
		
		// TODO Auto-generated method stub

	}

}
