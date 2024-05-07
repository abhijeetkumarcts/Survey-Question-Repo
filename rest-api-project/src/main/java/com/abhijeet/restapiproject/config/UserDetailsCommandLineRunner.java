package com.abhijeet.restapiproject.config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abhijeet.restapiproject.model.UserDetails;
import com.abhijeet.restapiproject.repository.UserDetailsRepository;

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final UserDetailsRepository repository;

	public UserDetailsCommandLineRunner(UserDetailsRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new UserDetails("Abhijeet", "Admin"));
		repository.save(new UserDetails("Samarth", "Admin"));
		repository.save(new UserDetails("Sumiksha", "User"));
		
		//List<UserDetails> users = repository.findAll();
		
		List<UserDetails> users = repository.findByRole("Admin");
		
		users.forEach(user -> logger.info(user.toString()));
		
	}

}