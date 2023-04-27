package org.example.Service;

import org.example.Model.Employee;
import org.example.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    //removed the hard coded values
//    //Now we are going to fetch the values from database
//    //@Autowired annotation --to autowire the repo EmployeeRepository
//    @Autowired
//    private EmployeeRepository eRepository;
//
//    @Override
//    public List<Employee> getEmployees() {
//        return eRepository.findAll(); //returning list
//    }


@Service
public class EmployeeServiceImpl implements EmployeeService {
    //creating a list to store the employee object
    private static List<Employee> list =new ArrayList<>();
    //creating   static block
    static {
        Employee e = new Employee();    //creating employee object
        e.setName("Bhusan");
        e.setAge(28L);
        e.setDept("IT");
        e.setEmail("Bhusan@gmail.com");
        e.setLocation("India");
        list.add(e);//adding employee to the list

        e = new Employee();    //creating employee object
        e.setName("Bharat");
        e.setAge(32L);
        e.setDept("Textile");
        e.setEmail("Bharat@gmail.com");
        e.setLocation("Australia");
        list.add(e);//adding employee to the list
    }
    @Override
    public List<Employee> getEmployees() {
        return list; //returning list
    }
}
