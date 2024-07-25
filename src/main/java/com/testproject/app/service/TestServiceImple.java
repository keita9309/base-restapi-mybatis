package com.testproject.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.app.domain.dto.RequestDto;
import com.testproject.app.domain.dto.ResponseDto;
import com.testproject.app.service.apigroup.IApiGroupService;

@Service
public class TestServiceImple implements ITestService {
	
	@Autowired
	IApiGroupService iApiGroupService;

	@Override
	public List<ResponseDto> apiGroupService(RequestDto request) {
		return iApiGroupService.getInfo(request);
	}

}
