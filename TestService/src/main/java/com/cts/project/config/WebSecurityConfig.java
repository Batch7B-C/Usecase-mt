package com.cts.project.config;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
	import org.springframework.security.config.annotation.web.builders.HttpSecurity;
	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
	import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


	@Configuration
	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
		
		@Autowired
		ServiceConfig serviceConfig;
		
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception
		{
			System.out.println(serviceConfig.getUsername1()+":"+serviceConfig.getPassword1());
			auth.inMemoryAuthentication()
			.withUser(serviceConfig.getUsername1()).password("{noop}"+serviceConfig.getPassword1()).authorities("ROLE_ADMIN");
		}
		
		@Override
		protected void configure(HttpSecurity http) throws Exception
		{
			http
			.csrf().disable()
			.authorizeRequests()
			.anyRequest().authenticated()
			.and().httpBasic();
		}
		
	}

