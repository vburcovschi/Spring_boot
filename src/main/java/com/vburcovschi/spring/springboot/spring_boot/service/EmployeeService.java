package com.vburcovschi.spring.springboot.spring_boot.service;


import com.vburcovschi.spring.springboot.spring_boot.entity.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void removeEmployee(int id);
}
