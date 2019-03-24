package com.gowtham.service.annotation;

import com.gowtham.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeAutowiredByTypeService {
    @Autowired
    private Employee employee;

    @Autowired
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
