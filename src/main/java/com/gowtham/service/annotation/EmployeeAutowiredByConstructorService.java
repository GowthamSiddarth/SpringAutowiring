package com.gowtham.service.annotation;

import com.gowtham.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeAutowiredByConstructorService {
    private Employee employee;

    public EmployeeAutowiredByConstructorService(@Qualifier("employee") Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
