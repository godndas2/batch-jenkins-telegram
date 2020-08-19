package com.example.pay;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int accountNumb;

    // TODO
}
