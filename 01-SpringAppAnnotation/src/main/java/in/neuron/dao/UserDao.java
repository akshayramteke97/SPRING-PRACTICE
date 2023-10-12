package in.neuron.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("UserDao class is created");
	}
	public boolean save() {
		System.out.println("able to save");
		return true;
	}
}
