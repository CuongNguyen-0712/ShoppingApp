package com.backend.server.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "`Order`")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @Column(length = 10)
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    private String total;
    private String status;
    private String shippingFee;
    private String paymentMethod;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
}
