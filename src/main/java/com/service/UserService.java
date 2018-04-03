package com.service;

import com.entity.User;

/**
 * Created by ShkarupaN on 03.04.2018.
 */
public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
