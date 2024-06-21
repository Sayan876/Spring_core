package FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
   public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("msf.xml");
	MySessionFactory mf = context.getBean("mfs",MySessionFactory.class);
	System.out.println(mf.getDatasource());
	
}
}
