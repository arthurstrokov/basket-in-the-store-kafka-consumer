package com.gmail.arthurstrokov.consumer;

import com.gmail.arthurstrokov.consumer.service.KafkaConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class KafkaConsumerApplicationTest {

    @MockBean
    KafkaConsumerService kafkaConsumerService;

    @Test
    void contextLoads() {
        assertNotNull(kafkaConsumerService);
    }
}
