package com.example.demo.Model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "model.employee")
@Component
public class Employee {
	
	private String id;
	private String name;
	private String sal;
	

}
