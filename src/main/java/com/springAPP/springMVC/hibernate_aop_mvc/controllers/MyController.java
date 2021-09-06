package com.springAPP.springMVC.hibernate_aop_mvc.controllers;

import com.springAPP.springMVC.hibernate_aop_mvc.dao.EmployeeDAO;
import com.springAPP.springMVC.hibernate_aop_mvc.entity.Employee;
import com.springAPP.springMVC.hibernate_aop_mvc.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

//    @Autowired
//    private EmployeeDAO employeeDAO;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){

        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("allEmps", employeeList);

        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
}
