package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Sowmiya", "Balakrishnan", "pqr@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Madhu", "Chandar", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Swethaa", "Radhakrishnan", "titanic@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
