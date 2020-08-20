package com.example.pay;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BankTest {

    @Autowired
    private BankRepository bankRepository;

    @Before
    public void init() {
        Bank bank = Bank.builder()
                .id(1L)
                .name("IBK")
                .accountNumb(123456789)
                .accountPw(1234)
                .build();

        bankRepository.save(bank);
    }

    @After
    public void tearDown() {
        bankRepository.deleteAll();
    }

    @Test
    public void createBankInfoSuccess() throws Exception {
        System.out.println("TEST");
    }
}
