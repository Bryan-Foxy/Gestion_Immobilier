package com.winners.microuser;

import com.winners.microuser.entity.User;
import com.winners.microuser.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroUserApplication.class, args);
    }

    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            Stream.of("Mariem", "Yossra", "Bryan").forEach(nom -> {
                repository.save(new User(nom));
            });
            repository.findAll().forEach(System.out::println);
        };
    }

}
