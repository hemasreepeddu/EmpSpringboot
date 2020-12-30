package com.spring.boot.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/")
public class SpringController {
	@Autowired	
	EmployeeDao empdao;

	@PostMapping(value="empproject/success")
	public String test(@ModelAttribute("Register")Employee emp) {
		//ApplicationContext context=new AnnotationConfigApplicationContext(MvcConfiguration.class);
		//dao=context.getBean("dao", EmpDao.class);
		int i=empdao.add(emp);
		System.out.println(i);
		System.out.println("s"+emp.getEmail());
		return "success";
	}
	

	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView register() {
		
		System.out.println("Home");
		return new ModelAndView("home", "command", new Employee());
		
	}
}
