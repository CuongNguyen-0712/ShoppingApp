package com.backend.server.mapper;

import com.backend.server.dto.*;
import com.backend.server.entity.*;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public static ProductDTO toDTO(Product product) {
        if (product == null) return null;

        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .categoryId(product.getCategoryId())
                .status(product.getStatus())
                .variants(toVariantDTOList(product.getVariants()))
                .build();
    }

     private static List<ProductVariantDTO> toVariantDTOList(List<ProductVariant> variants) {
        if (variants == null) return null;
        return variants.stream()
                .map(ProductMapper::toVariantDTO)
                .collect(Collectors.toList());
    }

     public static ProductVariantDTO toVariantDTO(ProductVariant variant) {
        return ProductVariantDTO.builder()
                .skuId(variant.getSkuId())
                .skuCode(variant.getSkuCode())
                .color(variant.getColor())
                .size(variant.getSize())
                .quantity(variant.getQuantity())
                .price(variant.getPrice())
                .imageUrl(variant.getImageUrl())
                .build();
    }
}
