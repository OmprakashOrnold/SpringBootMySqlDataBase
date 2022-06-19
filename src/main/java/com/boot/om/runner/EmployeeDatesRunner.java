package com.boot.om.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.boot.om.model.EmployeeDates;
import com.boot.om.repo.EmployeeDatesRepo;

@Component
public class EmployeeDatesRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeDatesRepo empRepo;

	@Override
	public void run(String... args) throws Exception {

		Date date = new Date();
		EmployeeDates ed=new EmployeeDates("Om",date,date,date);
		empRepo.save(ed);
	}

}
