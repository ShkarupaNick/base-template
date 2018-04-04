package com.audit;

import com.entity.User;
import com.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SpringSecurityAuditorAware implements AuditorAware<User> {

    @Autowired
    private SecurityService userService;

    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.of(userService.getCurrentUser()==null?new User():userService.getCurrentUser());
    }
}