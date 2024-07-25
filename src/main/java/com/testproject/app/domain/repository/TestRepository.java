package com.testproject.app.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.testproject.app.domain.dto.RequestDto;
import com.testproject.app.domain.dto.ResponseDto;

@Mapper
public interface TestRepository {
	
	List<ResponseDto> getInfo(RequestDto request);

}
