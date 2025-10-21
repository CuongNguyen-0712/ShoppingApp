package com.backend.server.mapper;

import com.backend.server.dto.OrderDTO;
import com.backend.server.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public static OrderDTO toDTO(Order data){
        return OrderDTO.builder()
                .id(data.getId())
                .total(data.getTotal())
                .shipping_fee(data.getShippingFee())
                .status(data.getStatus())
                .createdAt(data.getCreatedAt())
                .items(data.getItems())
                .build();
    }
}
