package com.m200.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Cards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cardnumber;
    private String cardtype;
    private int customerId;
    @Column(nullable = false)
    private int cardlimit;
    @Column(nullable = false)
    private int cardbalance;

}
