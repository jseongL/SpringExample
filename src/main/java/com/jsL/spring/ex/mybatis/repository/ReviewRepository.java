package com.jsL.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jsL.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	
	//전달받은 아이디와 일치하는 행 조회
	//리턴 타입이 Review      //다름 param id는 키워드 int id 는 파라메터
	public Review selectReview(@Param("id")int id);

}
