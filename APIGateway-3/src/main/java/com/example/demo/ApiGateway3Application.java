package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient
@SpringBootApplication
public class ApiGateway3Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway3Application.class, args);
	}
	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	
		return builder.routes()
				
				.route("micro-user", r->r.path("/micro-user/**")
					   .uri("http://localhost:8280/"))
				.route("JobMs", r->r.path("/jobs/**")
						   .uri("http://localhost:8081/"))
				
				.build();
				
	}

}
