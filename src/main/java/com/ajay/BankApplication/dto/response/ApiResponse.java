package com.ajay.BankApplication.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

	private T resultData;
	private String message;
	private Boolean success;
	private Long totalCount;

	public T getResultData() {
		return resultData;	
	}

	public void setResultData(T resultData) {
		this.resultData = resultData;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
