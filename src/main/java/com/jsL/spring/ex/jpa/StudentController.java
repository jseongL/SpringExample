package com.jsL.spring.ex.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.spring.ex.jpa.domain.Student;
import com.jsL.spring.ex.jpa.service.StudentService;

@Controller
@RequestMapping("/jpa/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@ResponseBody
	@GetMapping("/create")
	public Student createStudent(){
		Student student = studentService.addStudent("김인규", "010-1111-2222", "lecture@hagulu", "개발자");
		
		return student;
	}
	
	
	@ResponseBody
	@GetMapping("/update")
	public Student updateStudent() {
		//id가 3인 학생의 장래 희망을 강사로 변경
		Student student = studentService.updateStudent(1, "강사");
		return student;
	}
	
	
	@ResponseBody
	@GetMapping("/delete")
	public String deleteStudent(){
		//id가 3인 학생정보 삭제
		studentService.deleteStudent(3);
		return "삭제 성공";
	}
	
	
	
}
