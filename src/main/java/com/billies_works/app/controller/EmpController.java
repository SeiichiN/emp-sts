package com.billies_works.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.billies_works.app.repository.EmpRepository;

@Controller
public class EmpController {
	
	@Autowired
	EmpRepository repository;
	
	@RequestMapping("/empList/findAll")
	public String showEmpList( Model model ) {
		model.addAttribute("empList", repository.findAll());
		return ("empList/emp_list");
	}
	
	
}
