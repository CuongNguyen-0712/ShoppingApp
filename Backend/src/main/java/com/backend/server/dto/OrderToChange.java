package com.backend.server.dto;

import lombok.Data;

@Data
public class OrderToChange {
    String orderId;
    String userId;
    String status;
}
