package string;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("string")
@Configuration
public class NewlecDIConfig {

	@Bean
	public Exam exam()
	{
		return new NewlecExam();
	}
	
}
