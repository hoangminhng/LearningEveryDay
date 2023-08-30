package com.hoangminhng.lesson4_2.dao;

import com.hoangminhng.lesson4_2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")//set the path from employees to members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //with JPaRepository, we no need to write any code
}
