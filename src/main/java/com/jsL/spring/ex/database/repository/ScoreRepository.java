package com.jsL.spring.ex.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jsL.spring.ex.database.domain.Score;

@Mapper
public interface ScoreRepository {

	//score테이블 모든 행 조회
	public List<Score> selectScoreList();
	
}
