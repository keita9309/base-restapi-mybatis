package com.testproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testproject.app.domain.dto.RequestDto;
import com.testproject.app.domain.dto.Response;
import com.testproject.app.domain.dto.ResponseDto;
import com.testproject.app.service.ITestService;

@RestController
public class testController {
	
	@Autowired
	ITestService iTestService;
	
	@GetMapping("/test")
	public ResponseEntity<Response>testHandle(@RequestBody RequestDto request) {
		
		List<ResponseDto> responseDto = iTestService.apiGroupService(request);
		
		Response response = new Response();
		response.setResponseDtoList(responseDto);
		
		return new ResponseEntity<Response>(response, HttpStatus.OK);
		
	}

}
