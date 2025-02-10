package com.jsL.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	
	// 간단한 html 태그를 response에 담는 페이지
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/1")
	public String htmlResponse() {
		return "<h2>예제 1번</h2>";
	}
	
	// 맵 객체를 response에 담는 페이지
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	public Map<String, Integer> mapResponse(){
		//과일이름 : 가격
		Map<String, Integer> fruitMap =new HashMap<>();
		
		fruitMap.put("apple", 1500);
		fruitMap.put("banana", 4500);
		fruitMap.put("orange", 1300);
		
		return fruitMap;
	}
	
	
	
	
	
	
	
	

}
