package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Employee;
import com.example.demo.Model.WelcomemsgWithValue;
import com.example.demo.Model.WorkingwithFileProps;
import com.example.demo.Model.WorkingwithNonPropsfile;
@Component
public class ReadData implements CommandLineRunner {
	@Autowired
	private Employee emp;
	@Autowired
	private WelcomemsgWithValue msg;
	
	@Autowired
	private WorkingwithNonPropsfile wok;
	
	@Autowired
	private WorkingwithFileProps wf;

	@Override
	public void run(String... args) throws Exception {
	System.out.println(emp);
	System.out.println(msg);
	System.out.println(wok);
	System.out.println(wf);

	}

}
