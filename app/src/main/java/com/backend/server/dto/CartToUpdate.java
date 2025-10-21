package com.backend.server.dto;

import lombok.Data;

@Data
public class CartToUpdate {
    String userId;
    String productVariantId;
    int quantity;
}
