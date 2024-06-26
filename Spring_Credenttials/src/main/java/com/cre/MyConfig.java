package com.cre;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.cre"})
@PropertySource(value= {"jdbc.properties"})
public class MyConfig {

}
