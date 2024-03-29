package com.ownedsteamgames.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class OwnedSteamGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnedSteamGamesApplication.class, args);
	}

}
