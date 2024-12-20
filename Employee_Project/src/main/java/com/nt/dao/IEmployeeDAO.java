package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	
public String addEmployees(List<Employee> emps);
public List<Employee>getEmpByDesignation(String designation);	
	
}
