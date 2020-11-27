package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public interface EmployeeService {
	public Integer addEmployee(Employee employee) throws EmployeeException;
	public Integer deleteEmployee(Integer empid) throws EmployeeException;
	public List<Employee> 
	getEmployeesByInsuranceScheme(String insuranceScheme) 
			throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
}
