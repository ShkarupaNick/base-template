package com.service;

import com.entity.UserBean;

/**
 * Created by ShkarupaN on 03.04.2018.
 */
public interface UserService {
    void save(UserBean user);
    UserBean findByUsername(String username);
    UserBean getSystemUser();
}
