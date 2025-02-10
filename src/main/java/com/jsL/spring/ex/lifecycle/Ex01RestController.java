package com.jsL.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//해당 클래스의 모든 메소드는 @ResquestBody가 적용된다.
@RequestMapping("/lifecycle/ex01")
@RestController //@Controller + @ResponseBody
public class Ex01RestController {

	//직접 만든 클래스의 객체를 response에 담는다.
//	@ResponseBody포함됐음
	@RequestMapping("/3")
	public Person objectResponse(){
		
		Person me = new Person("ㅇㄹ", 213);
		
		return me;
	}
	
	//status code 직접 실행
	@RequestMapping("/4")
	public ResponseEntity<Person> entityResponse() {
		Person me = new Person("임지성", 24);
		
		ResponseEntity<Person> entity = new ResponseEntity<Person>(me, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
	
	
}
