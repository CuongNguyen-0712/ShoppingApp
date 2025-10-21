package com.backend.server.dto;

import com.backend.server.entity.Order;
import com.backend.server.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {
    String id;
    BigDecimal total;
    String status;
    BigDecimal shipping_fee;
    Order.PaymentMethod paymentMethod;
    LocalDateTime createdAt;
    List<OrderItem> items;
}
