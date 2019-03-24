package com.gowtham;

import com.gowtham.service.annotation.EmployeeAutowiredByConstructorService;
import com.gowtham.service.annotation.EmployeeAutowiredByTypeService;
import com.gowtham.service.xml.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService serviceByName = context.getBean("employeeServiceByName", EmployeeService.class);
        System.out.println(serviceByName.getEmployee().getName());

        EmployeeService serviceByType = context.getBean("employeeServiceByType", EmployeeService.class);
        System.out.println(serviceByType.getEmployee().getName());

        EmployeeService serviceByConstructor = context.getBean("employeeServiceByConstructor", EmployeeService.class);
        System.out.println(serviceByConstructor.getEmployee().getName());

        EmployeeAutowiredByTypeService autowiredByTypeService = context.getBean("employeeAutowiredByTypeService", EmployeeAutowiredByTypeService.class);
        System.out.println(autowiredByTypeService.getEmployee().getName());

        EmployeeAutowiredByConstructorService autowiredByConstructorService = context.getBean("employeeAutowiredByConstructorService", EmployeeAutowiredByConstructorService.class);
        System.out.println(autowiredByConstructorService.getEmployee().getName());

        context.close();
    }
}
