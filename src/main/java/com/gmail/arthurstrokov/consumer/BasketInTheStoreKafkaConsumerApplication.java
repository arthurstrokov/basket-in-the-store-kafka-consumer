package com.gmail.arthurstrokov.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class BasketInTheStoreKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasketInTheStoreKafkaConsumerApplication.class, args);
	}
}
