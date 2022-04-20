package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeeController {
	
	@RequestMapping("employees")
	
	public List<Employee> getEmployees()
	{
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Jono", "MK"));
		employees.add(new Employee(2, "John", "Doe"));
		employees.add(new Employee(3, "Michaell", "Smith"));
		employees.add(new Employee(4, "Monia", "Star"));
		employees.add(new Employee(5, "Alli", "Joans"));
		return employees;
	}

}
