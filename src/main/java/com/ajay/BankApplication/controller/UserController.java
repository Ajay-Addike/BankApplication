package com.ajay.BankApplication.controller;


import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.BankApplication.dto.UserDto;
import com.ajay.BankApplication.dto.response.ApiResponse;
import com.ajay.BankApplication.exception.BankException;		
import com.ajay.BankApplication.serviceImpl.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Validated
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {


    @Autowired
    UserServiceImpl userService;

    @PostMapping("/createUser")
    public ApiResponse createUser(@RequestBody @Valid UserDto userDto) throws Exception {
        ApiResponse<UserDto> apiResponse = new ApiResponse<>();
        try {
            validateUserDto(userDto);
            userDto = userService.saveUser(userDto);
            apiResponse.setResultData(userDto);
            apiResponse.setMessage("created a user successfully");
            apiResponse.setSuccess(true);
        } catch (BankException bankException) {
            throw new BankException(bankException);
        } catch (Exception exception) {
            throw new Exception(exception);
        }
        return apiResponse;
    }

    private void validateUserDto(UserDto userDto) {
        if (userDto.getEmail() == null)
            throw new BankException("Email not found");
        if (userDto.getContact() == null)
            throw new BankException("Contact not found");
        if (userDto.getFirstName() == null)
            throw new BankException("First name not found");
        if (userDto.getUserType() == null)
            throw new BankException("User type not found");
        if (userDto.getPassword() == null)
            throw new BankException("Password not found");

    }

    @PutMapping("/updateUser")
    public ApiResponse updateUser(@RequestBody @Valid UserDto userDto) throws Exception {
        ApiResponse<UserDto> apiResponse = new ApiResponse<>();
        try {
            userDto = userService.updateUser(userDto);
            apiResponse.setResultData(userDto);
            apiResponse.setMessage("updated a user successfully");
            apiResponse.setSuccess(true);
        } catch (BankException bankException) {
            throw new BankException(bankException);
        } catch (Exception exception) {
            throw new Exception(exception);
        }
        return apiResponse;
    }

    @DeleteMapping("/deleteUser/{id}")
    public ApiResponse deleteUser(@PathVariable("id") @NotNull Long id) throws Exception {
        ApiResponse apiResponse = new ApiResponse<>();
        try {
            userService.deleteUser(id);
            apiResponse.setResultData(id);
            apiResponse.setMessage("deleted a user successfully");
            apiResponse.setSuccess(true);
        } catch (BankException bankException) {
            throw new BankException(bankException);
        } catch (Exception exception) {
            throw new Exception(exception);
        }
        return apiResponse;
    }

    @GetMapping("/getUser/{id}")
    public ApiResponse getUser(@PathVariable(name = "id") @NotNull Long id) throws Exception {
        ApiResponse<UserDto> apiResponse = new ApiResponse<>();
        try {
            UserDto userDto = userService.getUser(id);
            apiResponse.setResultData(userDto);
            apiResponse.setMessage("fetched a user successfully");
            apiResponse.setSuccess(true);
        } catch (BankException bankException) {
            throw new BankException(bankException);
        } catch (Exception exception) {
            throw new Exception(exception);
        }
        return apiResponse;
    }

    @GetMapping("/getAllUsers")
    public ApiResponse getAllUsers() throws Exception {
        ApiResponse<List<UserDto>> apiResponse = new ApiResponse<>();
        try {
            List<UserDto> userDtoList = userService.getAllUsers();
            apiResponse.setResultData(userDtoList);
            apiResponse.setMessage("fetched all user successfully");
            apiResponse.setSuccess(true);
        } catch (BankException bankException) {
            throw new BankException(bankException);
        } catch (Exception exception) {
            throw new Exception(exception);
        }
        return apiResponse;
    }

}
