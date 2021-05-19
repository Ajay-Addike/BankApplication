package com.ajay.BankApplication.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
	
import com.ajay.BankApplication.constant.*;

import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

	private Long id;

    private String bankAccNum;

    //@NotBlank --> it will not check for the null, it will check only length > 0
    @NotNull
    private String email;

    @NotNull
    private String firstName;

    private String lastName;

    @NotNull
    private String contact;

    //@JsonIgnore
    private String password;

    @NotNull
    private UserType userType;

    private String status;

    private Double amount;

    private BankDto bankDto;

    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBankAccNum() {
		return bankAccNum;
	}

	public void setBankAccNum(String bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public BankDto getBankDto() {
		return bankDto;
	}

	public void setBankDto(BankDto bankDto) {
		this.bankDto = bankDto;
	}

}

