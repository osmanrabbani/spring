package com.example.login_assing.service;

import com.example.login_assing.model.User;

import com.example.login_assing.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

    String findUserByEmail (String emailId);
}
