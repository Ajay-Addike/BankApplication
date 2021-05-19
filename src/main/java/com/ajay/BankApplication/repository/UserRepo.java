package com.ajay.BankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.BankApplication.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
