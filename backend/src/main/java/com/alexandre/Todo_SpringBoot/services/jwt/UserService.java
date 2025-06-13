package com.alexandre.Todo_SpringBoot.services.jwt;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDetailsService userDetailService();
}
