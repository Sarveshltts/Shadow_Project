package com.ltts.shadow.Tables.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.shadow.Tables.Models.User;

public interface User_JPA extends JpaRepository<User, Integer>{


	User findByUserName(String username);

}
