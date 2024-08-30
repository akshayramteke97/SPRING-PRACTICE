package in.akshay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.akshay.dto.StudentDTO;
import in.akshay.service.IService;
import in.akshay.vo.Student;

@Component(value = "control")
public class StudentController {
	
	@Autowired
	private IService service;
	
	static {
		System.out.println("StudentController .class file is loaded");
	}

//	public StudentController(IService service) {
//		this.service=service;
//		System.out.println("parameterized StudentController object instantiated");
//	}
	public String saveStudentData(Student vo) {
		StudentDTO dto = new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setName(vo.getName());
		dto.setSaddress(vo.getSaddress());
		dto.setDob(vo.getDob());
		
		return service.saveData(dto);
	}
	
	
}
