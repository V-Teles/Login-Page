package com.victor.loginsystem.service;

import com.victor.loginsystem.model.User;
import com.victor.loginsystem.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
