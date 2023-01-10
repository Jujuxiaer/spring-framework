package com.jujuxiaer;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan
public class JavaBeanConfig {

	@Bean
	public Person getPerson() {
		return new Person("hua");
	}
}
