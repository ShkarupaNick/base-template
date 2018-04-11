package com.config;
 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.social.autoconfigure.SocialProperties;

@ConfigurationProperties(prefix = "spring.social.google")
public class GoogleProperties extends SocialProperties {
 
}