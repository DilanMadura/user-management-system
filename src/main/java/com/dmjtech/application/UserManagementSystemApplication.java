package com.dmjtech.application;

import com.dmjtech.application.model.entity.User;
import com.dmjtech.application.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class UserManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagementSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner setDefaultData(UserRepository repo) {
        return args -> {
            List<User> defaultUsers = Arrays.asList(
                    new User(1, "Jakson", "jak@gmail.com"),
                    new User(2, "Martin", "martin@gmail.com")
            );
            defaultUsers.forEach(repo::save);
        };
    }
}
