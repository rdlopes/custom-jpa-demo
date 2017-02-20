package com.rdlopes.jpa.sample;

import com.rdlopes.jpa.autoconfigure.CustomJpaRepositories;
import com.rdlopes.jpa.custom.entities.User;
import com.rdlopes.jpa.custom.reporitories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@CustomJpaRepositories
public class CustomJpaSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomJpaSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataInitializer(UserRepository userRepository) {
        return args -> {
            User user1 = new User();
            user1.setName("user 1");
            userRepository.save(user1);

            User user2 = new User();
            user2.setName("user 2");
            userRepository.save(user2);

            userRepository.findAll()
                          .forEach(user -> System.out.println(
                                  userRepository.someCustomMethod(user.getId())));
        };
    }
}
