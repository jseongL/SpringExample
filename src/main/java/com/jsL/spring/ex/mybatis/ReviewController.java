package com.jsL.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.spring.ex.mybatis.domain.Review;
import com.jsL.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	//id가 5인 리뷰정보를 json으로 response에 담는다.
	@ResponseBody
	@RequestMapping("/mybatis/review") //어떤 파라메터 이름으로 전달받을지
	public Review review(@RequestParam("id") int id){
		//String idString = request.getParameter("id");
		//int id = Integer.parseInt("idString");
		
		//전달한 id와 일치하는 리뷰정보 얻어오기
		Review review = reviewService.getReview(id);
		
		return review;
		
	}

}
