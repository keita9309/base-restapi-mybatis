package com.testproject.app.service.apigroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.app.domain.dto.RequestDto;
import com.testproject.app.domain.dto.ResponseDto;
import com.testproject.app.domain.repository.TestRepository;

@Service
public class ApiGroupServiceImple implements IApiGroupService {
	
	@Autowired
	TestRepository testRepository;

	@Override
	public List<ResponseDto> getInfo(RequestDto request) {
		return testRepository.getInfo(request);
	}

}
