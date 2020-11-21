package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImplementation;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee e1=new Employee();		
		
		EmployeeService employeeService=new EmployeeServiceImplementation();
		employeeService.getEmployeeDetails(e1);
		employeeService.getInsuranceScheme(e1);
//		System.out.println(insurance);
		employeeService.showEmployeeDetails(e1);
	}

}
