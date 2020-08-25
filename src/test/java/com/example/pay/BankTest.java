package com.example.pay;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class BankTest {

    @Autowired
    private BankRepository bankRepository;

    private List<Bank> bankList;

    @BeforeEach
    public void init() {
        Bank bank = Bank.builder()
                .id(1L)
                .name("IBK")
                .accountNumb(123456789)
                .accountPw(1234)
                .build();

        bankRepository.save(bank);
    }

    @AfterEach
    public void tearDown() {
        bankRepository.deleteAll();
    }

    @Test
    public void createBankInfoSuccess() throws Exception {
        // 은행사 종류 및 식별 번호

    }
}
