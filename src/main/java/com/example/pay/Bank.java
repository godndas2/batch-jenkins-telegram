package com.example.pay;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int accountNumb;

    @Column(length = 4, nullable = false)
    private int accountPw;

    @Column(nullable = false)
    private int bankCode;

    @Builder
    public Bank(Long id, String name, int accountNumb, int accountPw, int bankCode) {
        this.id = id;
        this.name = name;
        this.accountNumb = accountNumb;
        this.accountPw = accountPw;
        this.bankCode = bankCode;
    }
}
