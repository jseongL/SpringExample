package com.jsL.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.spring.ex.database.domain.Score;
import com.jsL.spring.ex.database.repository.ScoreRepository;

@Service
public class ScoreService {

	@Autowired//스프링에서 내부적으로 객체 생성이 할 수 있게끔 인식(객체 주입)
	private ScoreRepository scoreRepository;
	
	//리스트 얻어오기
	public List<Score> getScoreList() {
		
		List<Score> score = scoreRepository.selectScoreList(); 
		return score;
	}
	
}
