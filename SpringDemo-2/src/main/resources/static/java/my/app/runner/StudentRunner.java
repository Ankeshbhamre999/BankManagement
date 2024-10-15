package my.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import my.app.entity.Clgdata;
import my.app.entity.Student;
import my.app.repo.ClgRepository;
import my.app.repo.StudentRepository;

public class StudentRunner implements CommandLineRunner 
{
	@Autowired
	 private StudentRepository repo;
	
	@Autowired
	private ClgRepository cr;

	@Override
	public void run(String... args) throws Exception 
	
	{
		Student s=new Student(1,"pawan","202","shahpur");
		repo.save(s);
		
		System.out.println(repo);
		
//		Clgdata cl=new Clgdata(1,"seva","shahpur");
//		cr.save(cl);
//		System.out.println(cl);
//		
//		// TODO Auto-generated method stub

	}

}
;