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
				.route("Gestion Forum", r->r.path("/Gestion Forum/**")
						   .uri("http://localhost:8082/"))
				.route("Gestion Reservation", r->r.path("/gestion Reservation/**")
						.uri("http://localhost:8081/"))
				.route("Gestion Produit", r->r.path("/gestion Produit/**")
						.uri("http://localhost:8090/"))
				.route("micro-service", r->r.path("/micro/**")
						.uri("http://localhost:8058/"))

				
				.build();
				
	}

}
