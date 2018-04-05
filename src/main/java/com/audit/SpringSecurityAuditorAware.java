package com.audit;

import com.entity.User;
import com.service.SecurityService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SpringSecurityAuditorAware implements AuditorAware<User> {

    @Autowired
    private SecurityService securityService;
    @Autowired
    private UserService userService;

    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.of(securityService.getCurrentUser()==null?userService.getSystemUser():securityService.getCurrentUser());
    }
}