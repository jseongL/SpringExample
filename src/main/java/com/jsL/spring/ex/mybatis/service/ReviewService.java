package com.jsL.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.spring.ex.mybatis.domain.Review;
import com.jsL.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	//전달받은 아이디와 일치하는 리뷰정보 얻어오기
	public Review getReview(int id){
		//new_review 테이블에서 id가 5인 행 조회
		Review review = reviewRepository.selectReview(id);
		
		return review;
		
	}

}
