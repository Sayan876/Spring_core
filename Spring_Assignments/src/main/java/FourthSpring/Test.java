package FourthSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ThirdSpring.MyDataSource;

public class Test {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	MyDataSource mds = context.getBean("myDataSource",MyDataSource.class);
	System.out.println(mds);
}
}
