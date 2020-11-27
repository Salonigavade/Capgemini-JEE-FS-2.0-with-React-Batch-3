package com.cg.training.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cg.training.bean.Department;
import com.cg.training.bean.Employee;
import com.cg.training.dao.EmployeeRepository;

public class EmployeeService {

	public Double sumOfSalaries() {
		List<Employee> empList=EmployeeRepository.getEmployees();
		Optional<Double> optional=	empList.stream()
				.map((e)->e.getSalary())
				.reduce((a,b)->a+b);

		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return 0.0;
		}
	}


	public void deptNameWithEmp() {
		//List<Department> deptList=EmployeeRepository.getDepartments();
		//List<Employee> list=EmployeeRepository.getEmployees();


//		Map<String, List<Employee>> map = EmployeeRepository.getEmployees()
//				.stream().
//				collect(Collectors.groupingBy((e)->e.getDepartment().getDept_name()));
//		for(String str:map.keySet()) {
//			System.out.println(str + map.get(str).size());
//		}

	}

	public void seniorEmp() {
		List<Employee> list=EmployeeRepository.getEmployees();
		Optional<Employee> op=list.stream()
				.sorted(Comparator.comparing(e1->e1.getHireDate()))
				.findFirst();

		if(op.isPresent()) {		
			System.out.println(op.get());
		}

	}

	public void empWithoutDept() {
		List<Employee> list=EmployeeRepository.getEmployees();
		list.stream()
		//.map(e->e.getEmployeeId())
		.filter(e1->e1.getDepartment()==null)
		.collect(Collectors.toList())
		.forEach(System.out::println);

	}

	public void depWithoutEmp() {
		List<Department> deptList=EmployeeRepository.getDepartments();
		deptList.stream()
		//.map(e->e.getEmployeeId())
		.filter(d->d.getDepartmentName()==null)
		.collect(Collectors.toList())
		.forEach(System.out::println);

	}

	public void highEmpDept() {
		List<Employee> list=EmployeeRepository.getEmployees();
		//		Optional<Employee> l= list.stream()
		//				.map((e)->e.getDepartment())
		//				.collect(Collectors.groupingBy(Employee::getEmployeeId,Collectors.counting())).get();
		//				

		//.collect(Collectors.counting()));
		//System.out.println(obj);
		/**Map<String,List<Employee>> map=list
				.stream()
				.Collect(Collectors.groupingBy((e)->e.getDepartment()));
			int max=0;
			String dept="";
			for(String str:map.keySet()) {
				if(map.get(str).size()>max) {
					max=map.get(str).size();
					dept=str;
				}
			}
			System.out.println(max);*/
	
	}

	public void empWithoutManager() {
		List<Employee> list=EmployeeRepository.getEmployees();
		list.stream()
		.filter(e->e.getManagerId()==null)
		.forEach(System.out::println);

	}

//	public List<String> empName() {
//		ArrayList<String> empName=new ArrayList<>();
//		List<Employee> list=EmployeeRepository.getEmployees();
//		list.stream().
//		filter((emp)->emp.getSalary()>20000).
//		forEach((emp)->empName.add(emp.getFirstName()));
//		return empName;
//		//		Optional<Employee> op=list.stream()
//		//		.sorted(Comparator.comparing(Employee::getEmployeeId))
//		//		;
//
//	}
	
	public void empWithDuration() {
		List<Employee> e=EmployeeRepository.getEmployees();
		for(Employee emp:e) {
			System.out.println(emp.getFirstName() + " "+
					ChronoUnit.MONTHS.between(emp.getHireDate(), LocalDate.now()));
		}
	}
	
	
	public void empDetails() {
		List<Employee> list=EmployeeRepository.getEmployees();
		for(Employee emp:list) {
			System.out.println(emp.getFirstName());
			System.out.println(emp.getLastName());
			System.out.println(emp.getHireDate());
			System.out.println(emp.getHireDate().getDayOfWeek());
		}
		System.out.println();
	}
	
	public void empFriday() {
		List<Employee> list=EmployeeRepository.getEmployees();
			list.stream()
			.filter((e)->e.getHireDate().getDayOfWeek().toString().equals("FRIDAY"))
			.collect(Collectors.toList());
			
			System.out.println(list.size());
			for(Employee emp:list) {
				System.out.println(emp.getFirstName());
			}
	}
	
	
	public void increasedSalary() {
		List<Employee> list=EmployeeRepository.getEmployees();
		list.stream().collect(Collectors.toList());
		for(Employee emp:list) {
			System.out.println("Emp Name: "+emp.getFirstName()
				+"Salary hike "+emp.getSalary()*1.15);
		}
	}
	
	
}
