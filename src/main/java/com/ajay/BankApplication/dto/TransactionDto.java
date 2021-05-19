package com.ajay.BankApplication.dto;

import javax.validation.constraints.NotNull;

import com.ajay.BankApplication.constant.ApplicationUsed;
import com.ajay.BankApplication.constant.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto {

    @NotNull
    private Double amount;

    @NotNull
    private ApplicationUsed applicationUsed;

    private String toBankAccNum;

    @NotNull
    private String fromBankAccNum;

    private Double yourBalance;

    private TransactionStatus transactionStatus;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public ApplicationUsed getApplicationUsed() {
		return applicationUsed;
	}

	public void setApplicationUsed(ApplicationUsed applicationUsed) {
		this.applicationUsed = applicationUsed;
	}

	public String getToBankAccNum() {
		return toBankAccNum;
	}

	public void setToBankAccNum(String toBankAccNum) {
		this.toBankAccNum = toBankAccNum;
	}

	public String getFromBankAccNum() {
		return fromBankAccNum;
	}

	public void setFromBankAccNum(String fromBankAccNum) {
		this.fromBankAccNum = fromBankAccNum;
	}

	public Double getYourBalance() {
		return yourBalance;
	}

	public void setYourBalance(Double yourBalance) {
		this.yourBalance = yourBalance;
	}

	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

}
