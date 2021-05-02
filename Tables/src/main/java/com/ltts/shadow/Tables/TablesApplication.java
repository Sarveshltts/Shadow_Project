package com.ltts.shadow.Tables;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ltts.shadow.Tables.Models.User;
import com.ltts.shadow.Tables.Repositories.User_JPA;

@SpringBootApplication
public class TablesApplication {
	
	@Autowired
	User_JPA userjpa;
	
	
	@PostConstruct
	public void initUsers()
	{
		List<User> users= Stream.of(new User(1,"sarvesh","password","sa724as@gmail.com")).collect(Collectors.toList());
		userjpa.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(TablesApplication.class, args);
	}

}
