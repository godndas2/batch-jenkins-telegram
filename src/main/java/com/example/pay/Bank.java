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
    private String bankName;

    @Column(nullable = false)
    private int accountNumb;

    @Column(length = 4, nullable = false)
    private int accountPw;

    @Column(nullable = false)
    private int bankCode;

    @Builder
    public Bank(String bankName, int accountNumb, int accountPw, int bankCode) {
        this.bankName = bankName;
        this.accountNumb = accountNumb;
        this.accountPw = accountPw;
        this.bankCode = bankCode;
    }

//    @Builder
//    public Bank(Long id, String bankName, int accountNumb, int accountPw, int bankCode) {
//        this.id = id;
//        this.bankName = bankName;
//        this.accountNumb = accountNumb;
//        this.accountPw = accountPw;
//        this.bankCode = bankCode;
//    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", accountNumb=" + accountNumb +
                ", accountPw=" + accountPw +
                ", bankCode=" + bankCode +
                '}';
    }
}
