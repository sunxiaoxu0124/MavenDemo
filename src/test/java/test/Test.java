package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user);
	}

}
