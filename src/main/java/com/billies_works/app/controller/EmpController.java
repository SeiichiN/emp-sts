package com.billies_works.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.billies_works.app.entity.Emp;
import com.billies_works.app.form.EmpForm;
import com.billies_works.app.repository.EmpRepository;

@Controller
public class EmpController {
	
	@Autowired
	EmpRepository repository;
	
	@RequestMapping("/emps/findAll")
	public String showEmpList( Model model ) {
		model.addAttribute("emps", repository.findAll());
		return ("emps/emp_list");
	}
	
	@RequestMapping("/emps/getOne/{empno}")
	public String showEmp( @PathVariable int empno, Model model ) {
		model.addAttribute("emp", repository.getOne(empno));
		return "emps/emp";
	}
	
	@RequestMapping("/emps/findBySal/{sal}")
	public String showEmpListBySal( @PathVariable int sal, Model model ) {
		model.addAttribute("emps", repository.findBySal(sal));
		return "emps/emp_list";
	}
	
	@RequestMapping("/emps/findByJobAndAge/{job}/{age}")
	public String showEmpListByJobAndAge (
			@PathVariable String job,
			@PathVariable int age,
			Model model) {
		model.addAttribute("emps", repository.findByJobAndAge(job, age));
		return "emps/emp_list";
	}
	
	@RequestMapping("/emps/findByEnameLike/{ename}")
	public String showEmpListByEnameLike (
			@PathVariable String ename,
			Model model) {
		model.addAttribute("emps", repository.findByEnameLike ("%" + ename + "%"));
		return "emps/emp_list";
	}
	
	@RequestMapping("/emps/create/input")
	public String createInput() {
		return "emps/create_input";
	}
	
	@RequestMapping(path = "/emps/create/complete", method = RequestMethod.POST)
	public String createComplete(EmpForm form) {
		Emp emp = new Emp();
		emp.setEmpno(form.getEmpno());
		emp.setEname(form.getEname());
		emp.setJob(form.getJob());
		emp.setSal(form.getSal());
		emp.setAge(form.getAge());
		emp.setDeptno(form.getDeptno());
		repository.save(emp);
		
		return "redirect:/emps/getOne/" + emp.getEmpno();
	}
	
	@RequestMapping("/emps/update/input/{empno}")
	public String updateInput(@PathVariable int empno, Model model) {
		model.addAttribute("emp", repository.getOne(empno));
		return "emps/update_input";
	}
	
	@RequestMapping(path = "/emps/update/complete/{empno}", method = RequestMethod.POST)
	public String updateComplete(@PathVariable int empno, EmpForm form) {
		Emp emp = repository.getOne(empno);
		emp.setEname(form.getEname());
		emp.setJob(form.getJob());
		emp.setSal(form.getSal());
		emp.setAge(form.getAge());
		emp.setEmpno(form.getEmpno());
		repository.save(emp);
		
		return "redirect:/emps/getOne/" + emp.getEmpno();
	}
}
