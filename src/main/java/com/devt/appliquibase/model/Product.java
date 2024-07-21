package com.devt.appliquibase.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(generator = "product_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "key", length = 64)
    private String key;

    @Column(name = "description")
    private String description;

}