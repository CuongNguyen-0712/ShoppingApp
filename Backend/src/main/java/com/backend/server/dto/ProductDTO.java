package com.backend.server.dto;

import com.backend.server.entity.Product;
import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private String id;
    private String name;
    private String description;
    private String category;
    private Product.Status status;
    private List<ProductVariantDTO> variants;
}
