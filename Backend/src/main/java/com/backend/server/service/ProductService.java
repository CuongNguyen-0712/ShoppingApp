package com.backend.server.service;

import com.backend.server.dto.ProductDTO;
import com.backend.server.entity.Product;
import com.backend.server.mapper.ProductMapper;
import com.backend.server.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDTO> get() {
        return productRepository.findAll().stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<ProductDTO> search(String name){
        List<Product> result = productRepository.findByNameContainingIgnoreCase(name);
        return result.stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }

//    public String add(ProductAddToCart data, String user_id){
//        try{
//            cartRepository.save();
//        }
//        catch (Exception e) {
//        }
//    }
}
