package com.springAPP.springMVC.hibernate_aop_mvc.services;

import com.springAPP.springMVC.hibernate_aop_mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}
