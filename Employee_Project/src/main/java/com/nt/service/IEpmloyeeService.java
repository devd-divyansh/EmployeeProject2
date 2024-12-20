package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEpmloyeeService {
public String addEmployees(List<Employee>emps);	

public List<Employee>getEmpoyeeBasedOnDesignation(String designation);

}
