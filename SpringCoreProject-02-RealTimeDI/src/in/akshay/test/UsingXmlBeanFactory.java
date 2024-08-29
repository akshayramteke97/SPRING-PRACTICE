package in.akshay.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.akshay.controller.StudentController;
import in.akshay.vo.Student;

public class UsingXmlBeanFactory {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/akshay/cfg/ApplicationContext.xml");
		System.out.println("*****Container Started*****");
		
		StudentController controller = context.getBean(StudentController.class);
		Student vo = new Student();
		vo.setSno("1");
		vo.setName("akshay");
		vo.setSaddress("nagpur");
		vo.setDob("29/12/1998");
		String data = controller.saveStudentData(vo);
		System.out.println(data);
		
	}

}
