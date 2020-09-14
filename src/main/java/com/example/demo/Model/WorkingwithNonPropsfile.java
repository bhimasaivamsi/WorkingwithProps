package com.example.demo.Model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;




@Component
@PropertySource("classpath:root.properties")
@Data
@ConfigurationProperties(prefix = "model.details")
public class WorkingwithNonPropsfile {
	
	private String user;
    private String id;	

}
