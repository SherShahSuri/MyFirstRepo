package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.connections.Employee;
import com.connections.MyConnection;
import com.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		int rowsAdded=0;
		String ADD_EMPLOYEE="insert into employee values ?,?,?,?,?";
		
		
		try {
			Connection con = MyConnection.openConnection();

			PreparedStatement ps = con.prepareStatement(ADD_EMPLOYEE);
			ps.setInt(1, emp.getEmpID());
			ps.setString(2, emp.getEmpName());
			ps.setInt(3, emp.getAge());
			ps.setDate(4, emp.joiningDate);
			ps.setDouble(5, emp.getSalary());
			rowsAdded = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return (rowsAdded>0);
		
	}

	@Override
	public boolean updateEmployee(int empID, Employee emp) {
		// TODO Auto-generated method stub
		
		boolean isUpdated = false;
		String UPDATE_BOOK = "update employee set empName=? where empID=?";
		try (Connection con = MyConnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(UPDATE_BOOK);
			ps.setString(1, emp.getEmpName());
			ps.setInt(2, empID);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				isUpdated = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return isUpdated;

	}

	@Override
	public Employee findEmployeeByID(int empID) {
		// TODO Auto-generated method stub
		boolean isFound = false;
		String UPDATE_BOOK = "select * from employee where empID=?";
		try (Connection con = MyConnection.openConnection();) {
			PreparedStatement ps = con.prepareStatement(UPDATE_BOOK);
			ps.setDouble(1, empID);
			int rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployees(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee removeEmployee(int empID) {
		// TODO Auto-generated method stub
		return null;
	}

}
