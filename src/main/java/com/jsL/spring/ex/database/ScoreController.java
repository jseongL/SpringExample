package com.jsL.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.spring.ex.database.domain.Score;
import com.jsL.spring.ex.database.service.ScoreService;

@Controller
public class ScoreController {
	   								//서비스 메서드만 생각
	@Autowired//스프링에 의해서  객체 생성 수정 자동으로 해줌
	private ScoreService scoreService;
	
	@ResponseBody//알아서 score의 값을 JSON타입으로 예쁘게 잡아줌
	@RequestMapping("/db/score/list")
	public List<Score> scoreList() {
		
		List<Score> score = scoreService.getScoreList();
		
		return score;//못생긴 문자열
		
	}

}
