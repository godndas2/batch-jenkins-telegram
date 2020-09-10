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
            Bank bank = bankRepository.findByAccountNumb(9999999);
            if (bank == null) {
                bank = Bank.builder()
                        .bankName("BANKTESTNAME")
                        .accountNumb(9999999)
                        .accountPw(9999999)
                        .bankCode(9999999)
                        .build();
                bankRepository.save(bank);
            }
        };
    }
//    @PostConstruct
//    public void validateJobNames() {
//        log.info("jobNames : {}", jobNames);
//        if (jobNames.isEmpty() || jobNames.equals("NONE")) {
//            throw new IllegalStateException("jobName 를 추가해주세요";
//        }
//    }
}
