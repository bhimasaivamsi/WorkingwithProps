package com.example.demo.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class WelcomemsgWithValue {
	@Value("${msg}")
private String msg;
}
