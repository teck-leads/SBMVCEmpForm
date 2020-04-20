package com.sb.emp.app.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sb.emp.app.model.Employee;
import com.sb.emp.app.repository.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getEmpsByJob(Employee emp) throws Exception {
		try {
			if (!StringUtils.isEmpty(emp.getJob())) {
				emp.setJob(emp.getJob().toUpperCase());
			}else {
				emp.setJob("#");
			}
			if (!StringUtils.isEmpty(emp.getName())) {
				emp.setName(emp.getName().toUpperCase());
			}else {
				emp.setName("#");
			}
			List<Employee> empsByJob = employeeDao.getEmpsByJob(emp);
			
			List<Employee> sortedByJob = empsByJob.stream()
			.sorted(Comparator.comparing(Employee::getJob)).collect(Collectors.toList());
			return sortedByJob;
		} catch (Exception e) {
			throw e;
		}
	}
}
