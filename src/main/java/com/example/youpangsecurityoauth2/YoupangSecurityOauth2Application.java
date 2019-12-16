package com.example.youpangsecurityoauth2;

import com.example.youpangsecurityoauth2.Entitiy.Role;
import com.example.youpangsecurityoauth2.Entitiy.User;
import com.example.youpangsecurityoauth2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;

@SpringBootApplication
public class YoupangSecurityOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(YoupangSecurityOauth2Application.class, args);
    }


    @Autowired
    public void authenticationManager(AuthenticationManagerBuilder build, UserRepository repo) throws Exception {
        if(repo.count() == 0){
            repo.save(new User("user","{noop}user", Arrays.asList(new Role("USER"),new Role("ACTUATOR"))));
        }
        build.userDetailsService(username -> new CustomerUserDetail(repo.findByUsername(username)));
    }
}
