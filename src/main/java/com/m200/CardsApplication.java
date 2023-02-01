package com.m200;

import com.m200.models.Cards;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

	@Bean(name = "cards")
	public Cards getCard(){
		return new Cards();
	}

}

