package com.example.webchat.core.security.permissionEvaluators;

import com.example.webchat.domain.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserPermissionEvaluator {

  public UserPermissionEvaluator() {
  }

  public boolean isUserAboveAge(User principal, int age) {
    return true;
  }

}
