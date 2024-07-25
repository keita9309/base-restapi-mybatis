package com.testproject.app.service;

import java.util.List;

import com.testproject.app.domain.dto.RequestDto;
import com.testproject.app.domain.dto.ResponseDto;

public interface ITestService {
	
	public List<ResponseDto> apiGroupService(RequestDto request);

}
