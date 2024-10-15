package com.example.demo.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.repo.Student;
import com.example.demo.repo.StudentRepo;

public class StudentRunner implements CommandLineRunner 
{
	@Autowired
	 private StudentRepo repo;

	@Override
	public void run(String... args) throws Exception 
	{
		Student s=new Student(1,"pawan","121");
		repo.save(s);
		Student s1=new Student(2,"shubham","122");
		repo.save(s1);
		List<Student>list=repo.findAll();
		System.out.println(list);
		
		System.out.println(repo);
		System.out.println("created");
		
		
		// TODO Auto-generated method stub

	}

}
