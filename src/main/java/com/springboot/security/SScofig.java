package com.springboot.security;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//@Configuration
//@EnableWebSecurity
public class SScofig extends WebSecurityConfigurerAdapter{

@Override
protected void configure(HttpSecurity httpSecurity) throws Exception {


httpSecurity.requestMatcher(EndpointRequest.toAnyEndpoint()).authorizeRequests()
.anyRequest().permitAll();
}

}
