package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public abstract void getEmployeeDetails(Employee employee);
	public abstract String getInsuranceScheme(Employee employee);
	public abstract void showEmployeeDetails(Employee employee);

}
