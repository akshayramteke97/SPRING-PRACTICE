package in.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("beans.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
		ApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml");
		
		factory.getBean("credit",CreditCardPay.class);
		factory.getBean("debit",DebitCardPay.class);
		
		
		PaymentProcess process=factory.getBean("payment",PaymentProcess.class);
		process.doPayment(100);
	}
}
