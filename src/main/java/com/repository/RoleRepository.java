package com.repository;

import com.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by ShkarupaN on 02.04.2018.
 */
public interface RoleRepository extends CrudRepository<Role, UUID>{
    Role findByName(Role.ERole name);
}
