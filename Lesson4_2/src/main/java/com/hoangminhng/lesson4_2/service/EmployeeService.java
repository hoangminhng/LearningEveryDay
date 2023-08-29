package com.hoangminhng.lesson4_2.service;

import com.hoangminhng.lesson4_2.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findByID(int theID);

    Employee save(Employee theEmployee);

    void deleteByID(int theID);
}
