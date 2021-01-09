package com.assignments.assignment7.Security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


public class SecurityConfigurer extends JwtRequestFilter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	}
}
