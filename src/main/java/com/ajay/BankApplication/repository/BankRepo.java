package com.ajay.BankApplication.repository;

import com.ajay.BankApplication.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<Bank, Long> {

    Bank findBybankAccNum(String bankAccountNum);

}
