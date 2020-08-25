package com.example.pay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class BankItemProcessor implements ItemProcessor<Bank, Bank> {

    @Override
    public Bank process(final Bank bank) throws Exception {
        final String bankName = bank.getName().toUpperCase();
        final int accountNumber = bank.getAccountNumb();
        final int accountPassword = bank.getAccountPw();
        final int bankCode = bank.getBankCode();

        final Bank transformedBank = new Bank(bankName, accountNumber, accountPassword, bankCode);

        log.info("TransformedBank (" + bank + ") into (" + transformedBank + ")");

        return transformedBank;
    }
}
