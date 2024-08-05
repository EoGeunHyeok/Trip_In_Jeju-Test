package com.example.Trip_In_Jeju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = "com.example.Trip_In_Jeju")
public class TripInJejuApplication {

	//시작 구동
	public static void main(String[] args) {
		SpringApplication.run(TripInJejuApplication.class, args);
	}
}