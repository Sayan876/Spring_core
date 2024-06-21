package FourthSpring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages= {"FourthSpring"})
@PropertySource(value= {"mds.properties"})
public class MyConfig {

}
