package com;

import com.entity.Role;
import com.entity.User;
import com.repository.RoleRepository;
import com.repository.UserRepository;
import com.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserService userService;


    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(CommandLineAppStartupRunner.class);

    @Override
    public void run(String... args) throws Exception {

//        Role adminRole = new Role();
//        adminRole.setName(Role.ERole.ADMIN);
//        Role userRole = new Role();
//        userRole.setName(Role.ERole.USER);
//        roleRepository.save(adminRole);
//        roleRepository.save(userRole);



//        User user = new User();
//        user.setUsername("Syma");
//        user.setPassword("21928114");
//        Set<Role> roles = new HashSet<>();
//        roles.add(adminRole);
//        user.setRoleList(roles);
//        userService.save(user);
    }
}