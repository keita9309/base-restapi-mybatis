package com.testproject.app.service.apigroup;

import java.util.List;

import com.testproject.app.domain.dto.RequestDto;
import com.testproject.app.domain.dto.ResponseDto;

public interface IApiGroupService {
	
	public List<ResponseDto> getInfo(RequestDto request);

}
