package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImplementation implements EmployeeService{
	Scanner sc=new Scanner(System.in);


	@Override
	public void getEmployeeDetails(Employee employee) {

		System.out.println("Enter employee details:");
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter employee name:");
		String name=sc.nextLine();
		System.out.println("Enter employee salary:");
		double salary=sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter employee designation:");
		String designation=sc.nextLine();
//		System.out.println("Enter employee insurance scheme:");
//		String scheme=sc.nextLine();

		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
//		employee.setInsuranceScheme(scheme);

	}

	@Override
	public String getInsuranceScheme(Employee employee) {
		if(employee.getSalary()>20000 && employee.getSalary()<40000 &&
				employee.getDesignation()=="Analyst") {
			
				employee.setInsuranceScheme("10 lakh");
			
		}else if(employee.getSalary()>40000 && employee.getDesignation()=="Developer") {
			employee.setInsuranceScheme("20 lakh");
		}
		else {
			employee.setInsuranceScheme("5 lakh");
		}
		
		return 	null;

	}

	@Override
	public void showEmployeeDetails(Employee employee) {
		System.out.println("Employee Details are:");
				System.out.println(employee.getId()+"\t"
						+employee.getName()+"\t"
						+employee.getSalary()+"\t"
						+employee.getDesignation()+"\t"
						+employee.getInsuranceScheme()
						);
	}

}
