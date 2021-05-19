package com.ajay.BankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.BankApplication.model.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, Long> {
}
