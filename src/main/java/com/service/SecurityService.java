package com.service;

import com.entity.User;

public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
    User getCurrentUser();
}