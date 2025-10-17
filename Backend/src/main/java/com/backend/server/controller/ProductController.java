package com.backend.server.controller;


import com.backend.server.dto.ProductDTO;
import com.backend.server.service.ProductService;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/get")
    public List<ProductDTO> getProducts(){
        return productService.get();
    }

    @GetMapping()
    public List<ProductDTO> searchProduct(@RequestParam("search") String name){
        return productService.search(name);
    }
}
