package com.hoangminhng.lesson4_2.dao;

import com.hoangminhng.lesson4_2.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findByID(int theID) {
        Employee theEmployee = entityManager.find(Employee.class, theID);
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee); //if id == 0 the insert/save else update

        return dbEmployee;
    }

    @Override
    public void deleteByID(int theID) {
        Employee theEmployee = entityManager.find(Employee.class, theID);
        entityManager.remove(theEmployee);
    }
}
