package com.cg.eis.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.InsuranceScheme;

public class EmployeeDaoImpl implements EmployeeDAO{
	private static Map<Integer,Employee> employeeMap;
	
	static {
		employeeMap= new HashMap<>();
	}

	@Override
	public Integer addEmployee(Employee employee) throws Exception {
		try {
			int size=employeeMap.size();
			employeeMap.put(employee.getEmpid(), employee);
			int newSize=employeeMap.size();
			if(size==newSize) {
				throw new Exception("Unable to add employee");
			}
			return employee.getEmpid();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	@Override
	public Integer deleteEmployee(Integer empid) throws Exception {
		try {
			Employee e =employeeMap.remove(empid);
			if(e==null) {
				throw new Exception("Invalid Empid");
			}
			return e.getEmpid();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}		
		
	}

	@Override
	public List<Employee> getEmployeesByInsuranceScheme(InsuranceScheme insuranceScheme) throws Exception {
		try {
			List<Employee> employeeList=new ArrayList<>();
			for(Map.Entry<Integer,Employee> e: employeeMap.entrySet()) {
				Employee employee=e.getValue();
				if(employee.getInsuranceScheme().equals(insuranceScheme)) {
					employeeList.add(employee);
				}
			}
			if(employeeList.size()==0) {
				throw new Exception("No employee with insurance scheme:"+insuranceScheme);
			}
			return employeeList;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		try {
			List<Employee> employeeList= new ArrayList<>();
			for(Map.Entry<Integer,Employee> e: employeeMap.entrySet()) {
				employeeList.add(e.getValue());
			}
			if(employeeList.size()==0) {
				throw new Exception("List is empty");
			}
			return employeeList;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
