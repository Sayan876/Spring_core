package com;

import javax.persistence.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com" })
public class OfficeConfig {
	@Bean
	public EntityManager manager() {
		return Persistence.createEntityManagerFactory("development").createEntityManager();
	}
}
