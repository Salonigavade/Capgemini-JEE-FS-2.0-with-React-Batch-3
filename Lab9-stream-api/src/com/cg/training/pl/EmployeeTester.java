package com.cg.training.pl;

import java.util.List;

import com.cg.training.service.EmployeeService;

public class EmployeeTester {
	private static EmployeeService service=new EmployeeService();
	public static void main(String[] args) {

		Double total=service.sumOfSalaries();
		System.out.println("Sum of salaries: "+total);
		System.out.println();
		
		System.out.println("Department names and count of employees in each department. ");
		service.deptNameWithEmp();
		System.out.println();
		
		System.out.println("Senior Employee");
		service.seniorEmp();
		System.out.println();
		
		System.out.println("Employee without dept");
		service.empWithoutDept();
		System.out.println();
		
		System.out.println("Dept without employee");
		service.depWithoutEmp();
		System.out.println();
		
		System.out.println("Departments with highest count of employees");
		service.highEmpDept();
		System.out.println();
		
		System.out.println("Employee without manager");
		service.empWithoutManager();
		System.out.println();
		
		System.out.println("Employee name with duration");
		service.empWithDuration();
		System.out.println();
		
		System.out.println("List employee name, hire date and day of week on which employee has started");
		service.empDetails();
		System.out.println();
		
		System.out.println("List employee name, hire date and day of week for employee started on Friday. (Hint:  Accept the day name for e.g. FRIDAY and list all employees joined on Friday)");
		service.empFriday();
		System.out.println();
		
		System.out.println("List employee name, salary and salary increased by 15%.");
		service.increasedSalary();
		System.out.println();
	
		System.out.println("sort by emp id");
		service.sortEmpId().stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("sort by dept id");
		service.sortDept().stream().forEach(System.out::println);
	
System.out.println();
		
		System.out.println("sort by emp name");
		service.sortByFirstName().stream().forEach(System.out::println);
	
	}

}
