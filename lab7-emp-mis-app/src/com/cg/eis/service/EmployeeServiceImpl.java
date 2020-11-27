package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.data.EmployeeDAO;
import com.cg.eis.data.EmployeeDaoImpl;
import com.cg.eis.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDao= new EmployeeDaoImpl();

	@Override
	public Integer addEmployee(Employee employee) throws EmployeeException {
		try {
			double sal=employee.getSalary();
			if(sal >=40000.0 ) {
				employee.setDesignation(Designation.MANAGER);
				employee.setInsuranceScheme(InsuranceScheme.SCHEME_A);
			}else if(sal>= 20000.0) {
				employee.setDesignation(Designation.PROGRAMMER);
				employee.setInsuranceScheme(InsuranceScheme.SCHEME_B);
			}else if(sal >5000) {
				employee.setDesignation(Designation.SYSTEM_ASSOCIATE);
				employee.setInsuranceScheme(InsuranceScheme.SCHEME_C);
			}else {
				employee.setDesignation(Designation.CLERK);
				employee.setInsuranceScheme(InsuranceScheme.NO_SCHEME);
			}
			
			Integer empid=employeeDao.addEmployee(employee);
			return empid;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	}

	@Override
	public Integer deleteEmployee(Integer empid) throws EmployeeException {
		try {
			Integer id=employeeDao.deleteEmployee(empid);
			return id;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> getEmployeesByInsuranceScheme(String insuranceScheme) throws EmployeeException {
		try {
			InsuranceScheme scheme=null;			
			
			if(insuranceScheme.equalsIgnoreCase(InsuranceScheme.SCHEME_A.getScheme())) {
				scheme= InsuranceScheme.SCHEME_A;
			}else if(insuranceScheme.equalsIgnoreCase(InsuranceScheme.SCHEME_B.getScheme())) {
				scheme=InsuranceScheme.SCHEME_B;
			}else if(insuranceScheme.equalsIgnoreCase(InsuranceScheme.SCHEME_C.getScheme())) {
				scheme=InsuranceScheme.SCHEME_C;
			}else {
				scheme=InsuranceScheme.NO_SCHEME;
			}
			System.out.println(scheme);
			List<Employee> empList=
					employeeDao.getEmployeesByInsuranceScheme(scheme);
			return empList;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			List<Employee> employeeList= employeeDao.getAllEmployees();
			return employeeList;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	}

}
