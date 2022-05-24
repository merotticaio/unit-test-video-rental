package com.github.merotti.caio.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Rental {

    private User user;

    private Video video;

    private Date rentalDate;

    private Date returnDate;

    private Double value;

}
