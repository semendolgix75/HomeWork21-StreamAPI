package pro.sky.HomeWork18.lesson25.service;

import pro.sky.HomeWork18.lesson25.model.Employee;

import java.util.Collection;

public interface DepartmentService {


    Employee findEmployeeWithMaxSalary(int departmentId);

    Employee findEmployeeWithMinSalary(int departmentId);
}
