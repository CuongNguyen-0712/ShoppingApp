package com.backend.server.repository;

import com.backend.server.entity.ProductVariant;
import jakarta.persistence.Embeddable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariantsRepository extends JpaRepository<ProductVariant, String>{
    ProductVariant findBySkuId(String id);
}
