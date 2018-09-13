package com.dao;

import java.util.List;

import com.connections.Employee;

public interface EmployeeDAO {
	boolean addEmployee(Employee emp);
	int updateEmployee(int empID, Employee emp);
	Employee findEmployeeByID(int empID);
	List<Employee> findAllEmployees();
	List<Employee> findAllEmployees(double salary);
	Employee removeEmployee(int empID);
	
}
