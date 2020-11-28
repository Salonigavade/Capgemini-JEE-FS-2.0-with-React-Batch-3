package com.cg.training.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
		//		List<Employee> list= EmployeeRepository.getEmployees();
		//        Map<String, Long> emp =list.stream()
		//        		.filter((e)->e.getDepartment()==null)
		//                .collect(Collectors.groupingBy (dept -> dept.getDepartment().getDepartmentName (), Collectors.counting()));
		//        emp.entrySet().stream().forEach(e-> System.out.println(e));
		List<Employee> employeeList = EmployeeRepository.getEmployees();



		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.filter((emp) -> emp.getDepartment() != null )
				.collect(Collectors.groupingBy(dept -> dept.getDepartment().getDepartmentName(), 
						Collectors.counting()));

		System.out.println(employeeCountByDepartment);
	}


	public void seniorEmp() {
		List<Employee> list=EmployeeRepository.getEmployees();
		Optional<Employee> op=list.stream()
				.sorted(Comparator.comparing(e1->e1.getHireDate()))
				.findFirst();

		if(op.isPresent()) {		
			System.out.println(op.get().toString());
		}
	}
	//		       List<Employee> employeeList= EmployeeRepository.getEmployees();
	//        Employee maxByDate = employeeList
	//                .stream()
	//                .min(Comparator.comparing(Employee::getHireDate)) // getting employee with min hiredate who is senior
	//                .get();
	//        System.out.println("The senior most employee is "+maxByDate.getFirstName()+" "+maxByDate.getLastName());
	//		 

	//	}

	public void empWithoutDept() {
		List<Employee> list=EmployeeRepository.getEmployees();
		list.stream()
		.filter(e1->e1.getDepartment()==null)
		.collect(Collectors.toList())
		.forEach(System.out::println);

	}

	public void depWithoutEmp() {
		List<Department> deptList=EmployeeRepository.getDepartments();
		deptList.stream()
		.filter(d->d.getDepartmentName()==null)
		.collect(Collectors.toList())
		.forEach(System.out::println);

	}

	public void highEmpDept() {
		List<Employee> list=EmployeeRepository.getEmployees();
		Map<Department, Long> l= list.stream()
				.filter((e)->e.getDepartment()!=null)
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(l);


		//				for(Entry<Department, Long> obj:l.entrySet()) {
		//					//System.out.println("EmpId:"+obj.getKey());
		//					System.out.println("Dept:"+obj.getValue());
		//				}



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

		List<Employee> employeeList= EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach(e -> {
			Period period =e.getHireDate().until(LocalDate.now());
			System.out.println("Employee Id :"+e.getFirstName()+" "+e.getLastName()+
					" == Month:-"+ChronoUnit.MONTHS.between(e.getHireDate(), LocalDate.now())
					+" == Days:-"+period.getDays());
		});
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
		list.stream().
		collect(Collectors.toList());
		for(Employee emp:list) {
			System.out.println("Emp Name: "+emp.getFirstName()+ "Salary" +emp.getSalary()
			+"Salary increased: "+emp.getSalary()*1.15);
		}
	}

	public List<Employee> sortEmpId(){
		List<Employee> list=EmployeeRepository.getEmployees();
		return list.stream()
				//.filter((e)->e.getDepartment())
		.sorted(Comparator.comparing(Employee::getEmployeeId))
		.collect(Collectors.toList());
	}
	
	public List<Department> sortDept(){
		List<Department> list=EmployeeRepository.getDepartments();
		return list.stream()
				//.filter((dept)->dept.getDepartmentId()!=null)
		.sorted(Comparator.comparing(Department::getDepartmentId))
		.collect(Collectors.toList());
	}
	
	public List<Employee> sortByFirstName(){
		List<Employee> list=EmployeeRepository.getEmployees();
		return list.stream()
				.sorted(Comparator.comparing(Employee::getFirstName))
				.collect(Collectors.toList());
	}
}
