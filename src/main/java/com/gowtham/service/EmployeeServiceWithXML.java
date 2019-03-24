package com.gowtham.service;

import com.gowtham.model.Employee;

public class EmployeeServiceWithXML {
    private Employee employee;

    public EmployeeServiceWithXML(Employee employee) {
        this.employee = employee;
        System.out.println("Autowiring by Constructor");
    }

    public EmployeeServiceWithXML() {
        System.out.println("Default Constructor");
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
