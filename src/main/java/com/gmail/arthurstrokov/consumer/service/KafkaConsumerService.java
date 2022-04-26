package com.gmail.arthurstrokov.consumer.service;

import com.gmail.arthurstrokov.consumer.model.Basket;
import com.gmail.arthurstrokov.consumer.repository.BasketRepository;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class KafkaConsumerService {
    private final BasketRepository basketRepository;
    private final Gson gson;

    @KafkaListener(topics = "basket")
    public void orderListener(ConsumerRecord<Long, Basket> consumerRecord) {
        log.info("message get, partition={}, offset={}", consumerRecord.partition(), consumerRecord.offset());
        log.info("message get, key={}, value={}", consumerRecord.key(), consumerRecord.value());

        Basket basket = gson.fromJson(String.valueOf(consumerRecord.value()), Basket.class);
        log.info(String.valueOf(basket));

        basketRepository.save(basket);

        List<Basket> basketFromDb = basketRepository.findAll();
        log.info(String.valueOf(basketFromDb));
    }
}
