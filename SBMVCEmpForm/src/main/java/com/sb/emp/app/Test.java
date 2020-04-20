package com.sb.emp.app;

public class Test {

	public static void main(String[] args) {
		String SELECT_QRY = "SELECT EMPNO, ENAME, JOB, MGR, DEPTNO FROM EMP WHERE (EMPNO IS NOT NULL AND EMPNO = ?) OR (ENAME IS NOT NULL AND ENAME LIKE '#%') OR (JOB IS NOT NULL AND JOB LIKE '#%')  OR (SAL IS NOT NULL AND SAL >= ?)";
	
		int indexOf = SELECT_QRY.indexOf("#");
		System.out.println(indexOf);
		
		String ename = SELECT_QRY.replace("#1", "scott");
		System.out.println(ename);
		String job = ename.replace("#2", "Cleark");
		System.out.println(job);
		
		

	}

}
