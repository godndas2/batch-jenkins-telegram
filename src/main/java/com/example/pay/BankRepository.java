package com.example.pay;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {

    Bank findByAccountNumb(int accountNumb);
}
