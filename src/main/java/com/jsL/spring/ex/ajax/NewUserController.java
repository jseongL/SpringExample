package com.jsL.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.spring.ex.mvc.service.UserService;

@Controller
@RequestMapping("/ajax/user")
public class NewUserController {
	
	@Autowired
	private UserService userService;
	
	//사용자 추가 API
	@ResponseBody
	@PostMapping("/create")
	public Map<String, String> createUser(
			@RequestParam("name")String name
			,@RequestParam("birthday")String birthday
			,@RequestParam("email")String email
			,@RequestParam("introduce")String introduce
			) {
		
		int count = userService.addUser(name, birthday, email, introduce);
		
		Map<String, String > resultMap = new HashMap<>();
		//성공 {"result":"success"}
		//실패 {"result":"fail"}
		if(count == 1) {
			//성공
			resultMap.put("result", "success");
		}
		else {
			//실패
			resultMap.put("result", "fail");
		}
		
		return resultMap;
		
	}
	
	//view
	@GetMapping("/input")
	public String inputUser() {
		return "ajax/userInput";
	}
	
	
	//email을 전달받고, 이미 추가된 이메일인지를 알려주는 API
	@ResponseBody
	@GetMapping("/duplicateEmail")
	public Map<String, Boolean> isDuplicateEmail(
			@RequestParam("email") String email
			){
		boolean isDuplicate = userService.isDuplicateEmail(email);
		
		//중복됨{"isDublicate":true}
		//중복 안됨{"isDublicate":false}
		Map<String, Boolean> resultMap = new HashMap<>();
		
		if(isDuplicate) {
			resultMap.put("isDublicate", true);
		}
		else {
			resultMap.put("isDublicate", false);
		}
		
		return resultMap;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
