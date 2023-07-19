package com.example.crud.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
 
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Number price_in_cents;

}
