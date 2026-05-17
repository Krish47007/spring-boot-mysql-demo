package com.krish.spring_boot_mysql_demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class AbstractEntity {

    public static final String PRIMARY_KEY = "id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
