package com.krish.spring_boot_mysql_demo.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {

    public static final String TABLE = "address";
    private String building;
    private String street;
    private String zip;
    private String state;
    private String country;
}
