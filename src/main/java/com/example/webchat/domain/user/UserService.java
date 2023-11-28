package com.example.webchat.domain.user;

import com.example.webchat.core.generic.ExtendedService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService, ExtendedService<User> {

  User register(User user);
}
