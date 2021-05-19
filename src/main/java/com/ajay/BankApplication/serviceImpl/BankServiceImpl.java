package com.ajay.BankApplication.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.BankApplication.dto.BankDto;
import com.ajay.BankApplication.model.Bank;
import com.ajay.BankApplication.repository.BankRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BankServiceImpl {

    @Autowired
    BankRepo bankRepo;

    public BankDto creatBankAccount(BankDto bankDto) {
       Bank bank = convertDtoToBank(bankDto, false);
        bank = bankRepo.save(bank);
        bankDto = new BankDto();
        bankDto.setAmount(bank.getAmount());
        bankDto.setUser(bank.getUser());
        bankDto.setBankAccNum(bank.getBankAccNum());
        return bankDto;
    }

    private Bank convertDtoToBank(BankDto bankDto, boolean b) {
        Bank bank = new Bank();
        bank.setAmount(bankDto.getAmount());
        bank.setBankAccNum(bankDto.getBankAccNum());
        bank.setUser(bankDto.getUser());
        return bank;
    }
}
