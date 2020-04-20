package com.sb.emp.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Long id;
	private String name;
	private String job;
	private Long mgr;
	private Long deptNo;
	private Long salary;
	
	

}
