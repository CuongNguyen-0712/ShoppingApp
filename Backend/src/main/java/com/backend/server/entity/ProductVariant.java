package com.backend.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Product_variants")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVariant {

    @Id
    @Column(name = "sku_id", length = 10)
    private String skuId;

    @ManyToOne
    @JoinColumn(name = "spu_id", nullable = false)
    private Product product;

    @Column(unique = true, nullable = false)
    private String skuCode;

    @Column(nullable = false)
    private String color;

    @Column(length = 2, nullable = false)
    private String size;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String price;

    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Relationships
    @OneToMany(mappedBy = "productVariant", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Cart> carts;

    @OneToMany(mappedBy = "productVariant", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
}
