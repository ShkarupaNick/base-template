package com.repository;

import com.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
    User findByUsername(String username);


    @Query("SELECT u from User u WHERE u.isSystem = TRUE")
    User getSystemUser();
}