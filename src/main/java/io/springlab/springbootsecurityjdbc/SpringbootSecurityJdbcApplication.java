package io.springlab.springbootsecurityjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "io.springlab.springbootsecurityjdbc.*")
public class SpringbootSecurityJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityJdbcApplication.class, args);
	}

}
