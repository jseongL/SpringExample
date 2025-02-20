package com.jsL.spring.ex.thymeleaf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	
	@GetMapping("/ex01")
	public String ex01(){
		return "thymeleaf/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("귤");
		fruitList.add("바나나");

		model.addAttribute("fruitList", fruitList);
		
		//사용자 정보관리 리스트
		//"name" : "김인규", "age":29, "hobby":"독서"
		//"name" : "바다", "age":6, "hobby":"사냥하기"
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> userMap = new HashMap<>();
		
		userMap.put("name", "김인규"); 
		userMap.put("age", 29);
		userMap.put("hobby", "독서");
		list.add(userMap);
		
		
		userMap = new HashMap<>();
		userMap.put("name", "바다"); 
		userMap.put("age", 6);
		userMap.put("hobby", "사냥하기");
		list.add(userMap);
		
		
		model.addAttribute("list", list);
		
		
		
		return "thymeleaf/ex02";
	}

}
