//Controller package contains all the controller classes
package org.example.Controller;

import org.example.Model.Employee;
import org.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

     @Autowired
    private EmployeeService eService;


    @GetMapping("/employees")
    public List<Employee> getEmployees(){ //handler method
        System.out.println("Displaying the list of employees ");
        return eService.getEmployees();
    }

}
