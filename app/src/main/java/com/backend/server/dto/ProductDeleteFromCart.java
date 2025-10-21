package com.backend.server.dto;

import lombok.Data;

@Data
public class ProductDeleteFromCart {
    String productVariantId;
    String userId;
}
