//package com.hoangminhng.lesson4_2.service;
//
//import com.hoangminhng.lesson4_2.dao.EmployeeDAO;
//import com.hoangminhng.lesson4_2.dao.EmployeeRepository;
//import com.hoangminhng.lesson4_2.entity.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService{
//
//    private EmployeeRepository employeeRepository;
//
//    @Autowired
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee findById(int theID) {
//        Optional<Employee> result = employeeRepository.findById(theID);
//
//        Employee theEmployee = null;
//        if (result.isPresent()){
//            theEmployee = result.get();
//        }else{
//            throw new RuntimeException("Did not find employee id - " + theID);
//        }
//
//        return theEmployee;
//    }
//
//    @Override
////    @Transactional
//    public Employee save(Employee theEmployee) {
//        return employeeRepository.save(theEmployee);
//    }
//
//    @Override
////    @Transactional
//    public void deleteById(int theID) {
//        employeeRepository.deleteById(theID);
//    }
//}
