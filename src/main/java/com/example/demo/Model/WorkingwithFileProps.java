package com.example.demo.Model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "model.data")
//@PropertySource("file:C:\\Users\\db\\db.properties")
public class WorkingwithFileProps {
	
	private String db;
	private String name;
	private String port;

}
