package in.akshay.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import in.akshay.bo.StudentBO;

@Component(value = "dao")
public class DaoLayerImpl implements IDaoLayer {
	
	@Autowired
	@Qualifier(value = "datasource")
	private DataSource datasource;

	
	private String STUDENT_INSERT_QUERY="insert into Student(sno,sname,saddress,dob) values(?,?,?,?)";
	
	static {
		System.out.println("DaoLayerImpl .class file is loaded");
	}

//	public DaoLayerImpl(DataSource datasource) {
//		this.datasource=datasource;
//		System.out.println("DaoLayerImpl object instantiated");
//	}

	@Override
	public String saveData(StudentBO bo) {
		Connection connection=null;
		PreparedStatement  statement=null;
		boolean execute=false;
		try {
			connection = datasource.getConnection();
			
			if(connection!=null) {
				statement = connection.prepareStatement(STUDENT_INSERT_QUERY);
			}
			if(statement!=null) {
				statement.setInt(1, bo.getSno());
				statement.setString(2,bo.getName());
				statement.setString(3,bo.getSaddress());
				statement.setString(4,bo.getDob());
				
				execute = statement.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return execute==true ?"data insertion errors":"Data executed successfully";
	}

}
