package SecondSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiresource {
   public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("msf2.xml");
	MySessionFactory factory = context.getBean("msf",MySessionFactory.class);
//	MyDataSource factory = context.getBean("mds",MyDataSource.class);
	System.out.println(factory);
}
}
