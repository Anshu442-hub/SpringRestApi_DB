package org.example.Repository;

import org.example.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//JpaRepository -- will provide the database methods like CRUD
//             -- JpaRepository<entityClassName, dataTypeOfPrimaryKey>
//@Repository annotation -- mark the interface as @Repository
//                        --we have to autowire this repo to our ServiceClass
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
