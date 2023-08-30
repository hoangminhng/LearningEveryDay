package com.hoangminhng.lesson4_2.rest;

import com.hoangminhng.lesson4_2.entity.Employee;
import com.hoangminhng.lesson4_2.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeID}")
    public Employee getEmployee(@PathVariable int employeeID){
        Employee theEmployee = employeeService.findById(employeeID);

        if (theEmployee == null){
            throw new RuntimeException("Employee id not found - " + employeeID);
        }

        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeID}")
    public String deleteEmploye(@PathVariable int employeeID){
        Employee tempEmployee = employeeService.findById(employeeID);
        if (tempEmployee == null){
            throw new RuntimeException("Employee id not found - " + employeeID);
        }
        employeeService.deleteById(employeeID);
        return "Delete employee id - " + employeeID;
    }
}
