package com.service;

import com.entity.UserBean;

public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
    UserBean getCurrentUser();
}