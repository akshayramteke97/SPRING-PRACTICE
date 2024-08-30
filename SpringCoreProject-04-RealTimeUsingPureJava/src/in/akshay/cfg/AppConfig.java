package in.akshay.cfg;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("in.akshay")
public class AppConfig {

	@Bean(name = "datasource")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		Properties properties = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("in/akshay/properties/Application.properties");
		
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dataSource.setDriverClassName(properties.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(properties.getProperty("jdbc.url"));
		dataSource.setUsername(properties.getProperty("jdbc.username"));
		dataSource.setPassword(properties.getProperty("jdbc.password"));
		
		return dataSource;
	}
}
