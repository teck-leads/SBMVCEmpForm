package com.sb.emp.app.repository;

import java.util.List;

import com.sb.emp.app.model.Employee;

public interface EmployeeDao {
	
	List<Employee> getEmpsByJob(Employee emp) throws Exception;

}
