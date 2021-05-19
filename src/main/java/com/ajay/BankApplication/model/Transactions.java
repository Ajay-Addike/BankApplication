package com.ajay.BankApplication.model;

import com.ajay.BankApplication.constant.ApplicationUsed;
import com.ajay.BankApplication.constant.TransactionStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "application_used", nullable = false)
    private ApplicationUsed applicationUsed;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "to_bank_acc"/*, nullable = false*/)
    private String toBankAccNum;

    @Column(name = "from_bank_acc")
    private String fromBankAccNum;

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_status")
    private TransactionStatus transactionStatus;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ApplicationUsed getApplicationUsed() {
		return applicationUsed;
	}

	public void setApplicationUsed(ApplicationUsed applicationUsed) {
		this.applicationUsed = applicationUsed;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
