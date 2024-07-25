package com.testproject.app.domain.dto;

import java.util.List;

import lombok.Data;

@Data
public class Response {
	
	private String errorMessage;
	
	private List<ResponseDto> responseDtoList;

}
