package com.sbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.*;

@Configuration
@ComponentScan(basePackages = { "com.sbean" })

public class MyConfig {
	@Bean
	@Primary
	public List<String> getStudentNames() {
		return Arrays.asList("Luffy", "Robin", "Nami");
	}

	@Bean
	public List<String> getList() {
		return Arrays.asList("Ronaldo", "Gayle");
	}
}
