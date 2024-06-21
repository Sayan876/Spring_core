package com.spi;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.spi"})
@PropertySource(value= {"jdbc.properties"})
public class MyConfig {
   @Bean
   public List<String> mappingResources(){
	   return Arrays.asList("user","student");
   }
   @Bean
   public Properties hibernatepros() {
	   Properties p = new Properties();
	   p.setProperty("auto", "update");
	   p.setProperty("show_sql", "true");
	   p.setProperty("format_sql", "true");
	   p.setProperty("dialect", "org.hibernate.dialect.MYSQL8Dialect");
	   return p;
   }
}
