package com.sb.emp.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.emp.app.model.Employee;
import com.sb.emp.app.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String homepage() {
		return "empsearch";
	}
	
	@PostMapping(value = "/emps")
	public String processEmpSearch(Map<String, Object> map, @ModelAttribute Employee emp)throws Exception {
	
		List<Employee> empsByJob = empService.getEmpsByJob(emp);
		map.put("empsObjKey", empsByJob);
		return "emp_search_result";
		
	}

	
}
