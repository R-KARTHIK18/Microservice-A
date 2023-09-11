package spring.micro.add.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class addconfigs {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
