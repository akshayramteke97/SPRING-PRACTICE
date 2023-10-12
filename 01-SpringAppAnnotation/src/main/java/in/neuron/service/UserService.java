package in.neuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.neuron.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	public UserService() {
		System.out.println("UserService object is created");
	}
	public void storeInDb() {
		boolean status=userdao.save();
		if(status) {
			System.out.println("storing success");
		}
		else {
			System.out.println("storing failed");
		}
	}
}	
