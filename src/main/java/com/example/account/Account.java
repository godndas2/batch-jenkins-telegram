package com.example.account;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Account(String name) {
        this.name = name;
    }
    
    // TODO Account & Bank 편의 메소드
    public void findByAccountAndBankCode() {
        // 잠시 비공개
    }
}
