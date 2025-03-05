package com.jsL.spring.ex.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsL.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//모든 행을 id칼럼을 기반으로 내림차순 조회
	public List<Student>findAllByOrderByIdDesc();
	
	//id기준으로 내림차순 정렬된 결과를 2개만 조회
	//ORDER BY `id` DESC LIMIT 2
	public List<Student>findTop2ByOrderByIdDesc();
	
	
	//전달받은 이름과 일치하는 행 조회
	//WHERE `name` = #{name}
	public List<Student> findByName(String name);
	
	
	//전달받은 이름들과 일피하는 행 조회
	//WHERE `name` IN (#{}, #{})
	public List<Student> findByNameIn(List<String> nameList);
	
	
	//전달받은 키워드가 포함된 email 컬럼을 가진 행 조회
	//WHERE `email` LIKE `%${keyword}%`
	public List<Student> findByEmailContaining(String keyword);
	
	
	//아이디 컬럼값이 특정한 값 사이에 포함된 행으로 id기반으로 내짐차순 정렬 조회
	//WHERE `id` BETWEEN 1 AND 3 ODER BY `id` DESC
	public List<Student> findByIdBetWeenOderByIdDesc(int start, int end);
	
	
	//쿼리 직접 작성
	//dreamJob 일치하는 행 조회
	@Query(value="SELECT * FROM `new_student` WHERE `dreamJob` = :dreamJob", nativeQuery=true)
	public List<Student> selectByDreamJob(@Param("dreamJob")String dreamJob);
	
	
	
	
	
	
	
	
	
	
}
