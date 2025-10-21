package com.backend.server.mapper;

import com.backend.server.dto.CartDTO;
import com.backend.server.entity.Cart;

public class CartMapper {

    public static CartDTO toDTO(Cart cart) {
        if (cart == null) return null;

        return CartDTO.builder()
                .quantity(cart.getQuantity())
                .createdAt(cart.getCreatedAt())
                .cartProduct(ProductMapper.toVariantDTO(cart.getProductVariant()))
                .build();
    }

}
