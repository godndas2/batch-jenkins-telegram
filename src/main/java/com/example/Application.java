package com.example;

import com.example.pay.Bank;
import com.example.pay.BankRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(BankRepository bankRepository) {
        return args -> {
            Bank bank = bankRepository.findByAccountNumb(12341234);
            if (bank == null) {
                bank = Bank.builder()
                        .id(1L)
                        .name("BANKTESTNAME")
                        .accountNumb(12345)
                        .accountPw(1234)
                        .bankCode(12344)
                        .build();
                bankRepository.save(bank);
            }
        };
    }
}
