package in.neuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.neuron.service.UserService;

public class MyMainClass {
	public static void main(String[] args) {
		ApplicationContext service=new ClassPathXmlApplicationContext("Beans.xml");
		UserService userservice=service.getBean(UserService.class);
		userservice.storeInDb();
	}
}
