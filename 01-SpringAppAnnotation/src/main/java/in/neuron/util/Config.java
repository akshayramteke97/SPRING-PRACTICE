package in.neuron.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
		public Config() {
			System.out.println("Config Object");
		}
		@Bean
		public EncPassword getInstance() {
			EncPassword enc=new EncPassword("best algorithm"); 
				return enc;
			
		}
}
