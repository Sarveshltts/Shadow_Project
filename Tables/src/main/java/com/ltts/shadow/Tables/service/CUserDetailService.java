package com.ltts.shadow.Tables.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ltts.shadow.Tables.Models.User;
import com.ltts.shadow.Tables.Repositories.User_JPA;

@Service
public class CUserDetailService implements UserDetailsService {
	
	@Autowired
	User_JPA userjpa;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User users=userjpa.findByUserName(username);
		return new org.springframework.security.core.userdetails.User(users.getUsername(),users.getPassword(),new ArrayList<>());
	}

}
