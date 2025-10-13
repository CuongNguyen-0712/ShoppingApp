package com.backend.server.dto;

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
    private String categoryId;
    private String status;
    private List<ProductVariantDTO> variants;
}
