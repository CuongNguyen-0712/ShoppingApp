package com.backend.server.controller;

import com.backend.server.dto.OrderDTO;
import com.backend.server.dto.OrderToChange;
import com.backend.server.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("get")
    public List<OrderDTO> getOrder(@Param("id") String id){
        return orderService.get(id);
    }

    @PatchMapping("/change")
    public String deleteOrder(@RequestBody OrderToChange data){
        return orderService.change(data);
    }

}
