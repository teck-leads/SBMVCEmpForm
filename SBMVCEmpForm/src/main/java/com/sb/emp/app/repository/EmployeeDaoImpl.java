package com.sb.emp.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.sb.emp.app.DBQueries;
import com.sb.emp.app.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	final String PARAM1="#1";
	final String PARAM2="#2";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getEmpsByJob(Employee emp) throws Exception {
		try {
			List<Employee> emps = new ArrayList<>();
			
			String SELECT_QUERY = DBQueries.SELECT_QRY.replace(PARAM1, emp.getName());
			SELECT_QUERY=SELECT_QUERY.replace(PARAM2, emp.getJob());
			
			
			Object[] params= {emp.getId(),emp.getSalary() };

//			jdbcTemplate.query("SELECT EMPNO, ENAME, JOB, MGR, DEPTNO FROM EMP WHERE JOB=?",params, new ResultSetExtractor<List<Employee>>() {
//
//				@Override
//				public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
//					while (rs.next()) {
//						Employee emp = new Employee();
//						emp.setId(rs.getLong("EMPNO"));
//						emp.setName(rs.getString("ENAME"));
//						emp.setJob(rs.getString("JOB"));
//						emp.setMgr(rs.getLong("MGR"));
//						emp.setDeptNo(rs.getLong("DEPTNO"));
//						emps.add(emp);
//					}
//					return emps;
//				}
//			});
			
			jdbcTemplate.query(SELECT_QUERY, params, rs -> {

				while (rs.next()) {
					Employee empy = new Employee();
					empy.setId(rs.getLong("EMPNO"));
					empy.setName(rs.getString("ENAME"));
					empy.setJob(rs.getString("JOB"));
					empy.setMgr(rs.getLong("MGR"));
					empy.setDeptNo(rs.getLong("DEPTNO"));
					emps.add(empy);
				}
				return emps;
			});
			

			return emps;
		} catch (DataAccessException e) {
			throw e;
		}
	}

}
