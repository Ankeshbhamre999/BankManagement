package my.app.service;

import java.util.List;

import my.app.entity.Empolyee;

public interface EmpService 

{
	
	 public Integer  saveEmpolyee(Empolyee e);
	
	void updateEmpolyee(Empolyee e);
	
	void DeleteEmpolyee(Integer id);
	
	Empolyee GetoneEmpolyee(Integer id);
	
	List<Empolyee> getAllEmpoyee();
	

}
