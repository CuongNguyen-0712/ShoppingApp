package com.backend.server.repository;

import com.backend.server.entity.Cart;
import com.backend.server.entity.CartId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, CartId> {
    List<Cart> findByIdUserId(String id);
    Optional<Cart> findCartByIdProductVariantId(String id);
}
