package in.akshay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.akshay.bo.StudentBO;
import in.akshay.dao.IDaoLayer;
import in.akshay.dto.StudentDTO;

@Component(value = "service")
public class StudentServiceImpl implements IService {
	
	@Autowired
	private IDaoLayer dao;
	static {
		System.out.println("StudentServiceImpl .class file is loaded");
	}

//	public StudentServiceImpl(IDaoLayer dao) {
//		this.dao=dao;
//		System.out.println("parameterized StudentServiceImpl object instantiated");
//	}
	
	@Override
	public String saveData(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		
		bo.setSno(dto.getSno());
		bo.setName(dto.getName());
		bo.setSaddress(dto.getSaddress());
		bo.setDob(dto.getDob());
		
		return dao.saveData(bo);
	}

}
