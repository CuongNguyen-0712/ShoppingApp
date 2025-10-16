package com.backend.server.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {

    @Id
    @Column(name = "id_order", length = 10)
    private String idOrder;

    @ManyToOne
    @JoinColumn(name = "id_order", insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private ProductVariant productVariant;

    private int quantity;
    private String unitPrice;
}

