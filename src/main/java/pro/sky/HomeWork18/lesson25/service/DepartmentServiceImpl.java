package pro.sky.HomeWork18.lesson25.service;

import org.springframework.stereotype.Service;
import pro.sky.HomeWork18.lesson25.model.Employee;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @Override
    public Employee findEmployeeWithMaxSalary(int departmentId) {
        return  employeeService.findAll().stream()
                .filter(e -> e.getDepartmentNumber() == departmentId)
                .max(comparingInt(Employee::getSalary))
                .orElseThrow(RuntimeException::new);
    }
    @Override
    public Employee findEmployeeWithMinSalary(int departmentId) {
        return  employeeService.findAll().stream()
                .filter(e -> e.getDepartmentNumber() == departmentId)
                .min(comparingInt(Employee::getSalary))
                .orElseThrow(RuntimeException::new);
    }
}
