package com.fb2.fb;

import com.example.springbootthymeleafnew.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FbApplication {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getFirstName();

        SpringApplication.run(FbApplication.class, args);
    }



}
