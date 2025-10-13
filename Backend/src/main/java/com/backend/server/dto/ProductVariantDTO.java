package com.backend.server.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVariantDTO {
    private String skuId;
    private String skuCode;
    private String color;
    private String size;
    private int quantity;
    private String price;
    private String imageUrl;
}