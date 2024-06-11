package pro.sky.HomeWork18.lesson25.service;

import pro.sky.HomeWork18.lesson25.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName, Integer departmentNumber, Integer salary);
    Employee remove(String firstName, String lastName, Integer departmentNumber, Integer salary);
    Employee find(String firstName, String lastName, Integer departmentNumber, Integer salary);

    Collection<Employee> findAll();
}

