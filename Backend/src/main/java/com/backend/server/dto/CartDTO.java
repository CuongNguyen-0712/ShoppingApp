package com.backend.server.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartDTO {
    private int quantity;
    private LocalDateTime createdAt;
    private ProductVariantDTO cartProduct;
}