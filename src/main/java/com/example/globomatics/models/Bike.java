package com.example.globomatics.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "bike_table")
@Data
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM-dd-yyyy")
    private Date purchaseDate;

    private boolean contact;

}
