package com.hoangminhng.lesson4_2.dao;

import com.hoangminhng.lesson4_2.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findByID(int theID);

    Employee save(Employee theEmployee);

    void deleteByID(int theID);
}
