package com.vburcovschi.spring.springboot.spring_boot.dao;

import com.vburcovschi.spring.springboot.spring_boot.entity.Employee;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployee() {
/*        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Employee", Employee.class).getResultList();*/
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmloyees = query.getResultList();
        return  allEmloyees;
    }

    @Override
    public void saveEmployee(Employee employee) {
/*        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);*/
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int id) {
/*        Session session = entityManager.unwrap(Session.class);
        return session.get(Employee.class,id);*/
        return entityManager.find(Employee.class,id);
    }

    @Override
    public void removeEmployee(int id) {
/*        Session session = entityManager.unwrap(Session.class);
        session.remove(getEmployee(id));*/
        entityManager.remove(getEmployee(id));
    }


}
