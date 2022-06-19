package com.boot.om.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.boot.om.model.Employee;
import com.boot.om.repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * empRepo.saveAll(Arrays.asList(
		 * 
		 * new Employee("Prakesh","DEV",2673.8), new Employee("Gokesh","QA",289.8), new
		 * Employee("Lokesh","BA",2463.8), new Employee("Rakesh","DEV",2333.8), new
		 * Employee("Mukesh","QA",2343.8), new Employee("akesh","DEV",2343.8), new
		 * Employee("Zkesh","QA",2343.8)
		 * 
		 * ));
		 */
		
		List<Employee> empList = empRepo.findAll();
		empList.forEach(System.out::println);
		
		System.out.println("----------------Example Concept--------------------");
		
        Employee emp=new Employee();
        emp.setDept("DEV");
        
        Example<Employee> ex=Example.of(emp);
        
        List<Employee> exampleList = empRepo.findAll(ex);
        exampleList.forEach(System.out::println);
	}

}
