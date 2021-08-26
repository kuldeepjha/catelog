package com.catalog.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
public class SuccessResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5045251019987849369L;

	@JsonProperty("code")
	private Integer code;

	@JsonProperty("message")
	private String message;

	@JsonProperty("responseBody")
	private Object responseBody;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}

}
