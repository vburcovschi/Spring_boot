package com.vburcovschi.spring.springboot.spring_boot.dao;


import com.vburcovschi.spring.springboot.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();

/*    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    public void removeEmployee(int id);*/
}
