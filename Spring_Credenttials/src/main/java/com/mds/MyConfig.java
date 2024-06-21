package com.mds;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mds"})
@PropertySource(value = {"mds.properties"})
public class MyConfig {

}
