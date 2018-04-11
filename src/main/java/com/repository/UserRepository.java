package com.repository;

import com.entity.UserBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<UserBean, UUID> {
    UserBean findByUsername(String username);


    @Query("SELECT u from UserBean u WHERE u.isSystem = TRUE")
    UserBean getSystemUser();
}