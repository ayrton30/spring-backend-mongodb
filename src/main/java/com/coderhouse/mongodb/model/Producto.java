package com.coderhouse.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document("productos")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Producto {

    @Id
    private String id;
    private String title;
    private Integer price;
    private String category;
}
