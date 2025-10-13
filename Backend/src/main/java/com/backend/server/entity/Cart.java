package com.backend.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cart")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {

    @EmbeddedId
    private CartId id;

    private int quantity;
    private String unitPrice;
    private LocalDateTime createdAt;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "id_user")
    @JsonIgnore
    private User user;

    @ManyToOne
    @MapsId("productVariantId")
    @JoinColumn(name = "id_product")
    @JsonIgnore
    private ProductVariant productVariant;
}

