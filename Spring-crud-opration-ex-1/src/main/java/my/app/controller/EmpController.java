package my.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import my.app.entity.Empolyee;
import my.app.implservice.EmpImplService;

@Controller
@RequestMapping("/empolyee")
public class EmpController 
{
	@Autowired
	private  EmpImplService service;
	
	@GetMapping("/show")
	public String show()
	{
		return "ragister";
	}
     @PostMapping("/save")
	public String saveForm( @ModelAttribute Empolyee emp, Model model)
	{
		Integer id=service.saveEmpolyee(emp);
		 String msg= "Empolyee " +id + "created";
		
		return "ragister";
		
		
	}
}
