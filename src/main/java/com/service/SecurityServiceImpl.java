package com.service;

import com.entity.UserBean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService{
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserService userService;

    private static Logger logger = LogManager.getLogger(SecurityServiceImpl.class);

    @Override
    public String findLoggedInUsername() {

        if(null==SecurityContextHolder.getContext().getAuthentication()){
            return null;
        }
        Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (user instanceof org.springframework.security.core.userdetails.User) {
            return ((org.springframework.security.core.userdetails.User)user).getUsername();
        }
        return null;
    }

    @Override
    public void autologin(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());

        authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        if (usernamePasswordAuthenticationToken.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            logger.debug(String.format("Auto login %s successfully!", username));
        }
    }

    @Override
    public UserBean getCurrentUser() {
        String loggedUsername = findLoggedInUsername();
        if(null!=loggedUsername) {
            return userService.findByUsername(loggedUsername);
        }
        return null;
    }
}