package com.cg.eis.bean;

import com.cg.eis.service.Designation;
import com.cg.eis.service.InsuranceScheme;

public class Employee {
	private Integer empid;
	private String ename;
	private Double salary;
	private Designation designation;
	private InsuranceScheme insuranceScheme;
	
	public Employee() {
		
	}

	public Employee(Integer empid, String ename, Double salary, Designation designation,
			InsuranceScheme insuranceScheme) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public InsuranceScheme getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(InsuranceScheme insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
}
