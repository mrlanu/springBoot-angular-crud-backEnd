package com.lanu.crud_springboot_angular_backend;

import com.lanu.crud_springboot_angular_backend.entities.User;
import com.lanu.crud_springboot_angular_backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringbootAngularBackendApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("One", "One"));
		userRepository.save(new User("Two", "One"));
		userRepository.save(new User("Three", "One"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringbootAngularBackendApplication.class, args);


	}
}
