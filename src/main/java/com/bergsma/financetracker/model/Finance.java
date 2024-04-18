package com.bergsma.financetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    String Date;
    String Amount;
    String Description;

    public Finance() {

    }

    public Finance(String date, String amount, String description) {
        Date = date;
        Amount = amount;
        Description = description;
    }

}
