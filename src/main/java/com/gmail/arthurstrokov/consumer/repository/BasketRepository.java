package com.gmail.arthurstrokov.consumer.repository;

import com.gmail.arthurstrokov.consumer.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Long> {
}
