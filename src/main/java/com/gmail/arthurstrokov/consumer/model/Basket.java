package com.gmail.arthurstrokov.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(
            mappedBy = "basket",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<BasketProduct> basketProducts;
    private BigDecimal totalBasketPrice;
    private String localDateTime;
}
