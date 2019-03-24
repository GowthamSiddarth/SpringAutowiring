package com.gowtham.service.xml;

import com.gowtham.model.Employee;

public class EmployeeService {
    private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee = employee;
        System.out.println("Autowiring by Constructor");
    }

    public EmployeeService() {
        System.out.println("Default Constructor");
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
