package com.cg.eis.data;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.InsuranceScheme;

public interface EmployeeDAO {
	public Integer addEmployee(Employee employee) throws Exception;
	public Integer deleteEmployee(Integer empid) throws Exception;
	public List<Employee> 
	getEmployeesByInsuranceScheme(InsuranceScheme insuranceScheme) 
			throws Exception;
	
	public List<Employee> getAllEmployees() throws Exception;
}
