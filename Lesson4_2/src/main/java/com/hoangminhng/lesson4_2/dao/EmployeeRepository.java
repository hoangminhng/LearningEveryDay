package com.hoangminhng.lesson4_2.dao;

import com.hoangminhng.lesson4_2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //with JPaRepository, we no need to write any code
}
