package com.gmail.arthurstrokov.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "basketProduct")
public class BasketProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private Integer productCount;
    private BigDecimal totalPriceForProducts;
    @ManyToOne
    @JoinColumn(name = "basketProduct")
    private Basket basket;
}