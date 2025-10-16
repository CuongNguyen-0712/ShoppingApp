package com.backend.server.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Size_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SizeProduct {

    @Id
    @Column(length = 1)
    private String id;

    private String name;

    @OneToOne
    @JoinColumn(name = "id")
    private ProductVariant productVariant;
}
