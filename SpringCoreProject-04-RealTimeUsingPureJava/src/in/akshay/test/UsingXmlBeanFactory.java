package in.akshay.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.akshay.cfg.AppConfig;
import in.akshay.controller.StudentController;
import in.akshay.vo.Student;

public class UsingXmlBeanFactory {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("*****Container Started*****");
		
		StudentController controller = context.getBean(StudentController.class);
		Student vo = new Student();
		vo.setSno("11");
		vo.setName("sanjay");
		vo.setSaddress("nagpur");
		vo.setDob("29/01/1997");
		String data = controller.saveStudentData(vo);
		System.out.println(data);
		
	}

}
