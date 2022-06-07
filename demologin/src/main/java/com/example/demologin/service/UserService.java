package com.example.demologin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demologin.model.User;
import com.example.demologin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
