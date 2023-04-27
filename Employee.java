package org.example.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
//@Entity annotation -- to use this class as an entity class
//                   -- entity class is a special class that represents the database table
@Table(name ="Employee")
//@Table(name ="Employee") annotation -- to map this class with the database table
public class Employee {
    //@Column(name = "name") annotation -- to map the property with the column name
    //@Id annotation -- to mark this column as primary key
    //@GeneratedValue(strategy = GenerationType.AUTO) annotation -- to auto increment
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Long age;
    @Column(name = "location")
    private String location;
    @Column(name = "email")
    private String email;
    @Column(name = "dept")
    private String dept;


}
