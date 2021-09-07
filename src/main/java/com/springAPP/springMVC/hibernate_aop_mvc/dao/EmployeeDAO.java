package com.springAPP.springMVC.hibernate_aop_mvc.dao;

import com.springAPP.springMVC.hibernate_aop_mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
