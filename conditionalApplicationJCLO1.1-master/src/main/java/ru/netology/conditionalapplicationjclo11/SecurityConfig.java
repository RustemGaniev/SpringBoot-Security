package ru.netology.conditionalapplicationjclo11;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Rustem").password("{noop}parol").authorities("read","write");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.formLogin()
                .and()
                .authorizeHttpRequests().antMatchers("hi").permitAll()
                .and()
                .authorizeRequests().antMatchers("profile").hasAuthority("write");

    }
}
