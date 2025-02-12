package com.jsL.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.jsL.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	//id가 5인 행 조회 
	//리턴 타입이 Review
	public Review selectReview();

}
