package com.demo.ws;

import javax.jws.WebService;

@WebService
public class EmployeeService {

	public String createEmployee(Emp e) {
		return "Employee Created with id " + e.getEmpId();
	}

	public String updateEmployee(Emp e) {
		return "Employee update with id " + e.getEmpId();
	}

	public String deleteEmployee(int id) {
		return "Employee Created with id " + id;
	}

	public Emp findOne(int id) {
		return new Emp(id, "James", "Hyderabad", 67000);
	}
}
