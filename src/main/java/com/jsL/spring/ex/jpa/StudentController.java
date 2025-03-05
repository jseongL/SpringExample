package com.jsL.spring.ex.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.spring.ex.jpa.domain.Student;
import com.jsL.spring.ex.jpa.repository.StudentRepository;
import com.jsL.spring.ex.jpa.service.StudentService;

@Controller
@RequestMapping("/jpa/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	//경고
	//절대 controller에서 Repository를 직접 사용하면 안됌
	//단, 예제 진행 편의를 의 사용하는 것
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	
	
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
	
	
	@ResponseBody
	@GetMapping("/find")
	public List<Student> findStudent() {
		List<Student>studentList = null;
		
		
		//List<Student>studentList = studentRepository.findAll();
		//studentList = studentRepository.findAllByOrderByIdDesc();		
		//studentList = studentRepository.findTop2ByOrderByIdDesc();
		//studentList = studentRepository.findByName("김인규");
		
		
//		List<String> nameList = new ArrayList<>();
//		nameList.add("김인규");
//		nameList.add("유재석");
//		studentList = studentRepository.findByNameIn(nameList);
	
		//studentList = studentRepository.findByEmailContaining("naver");
		
		//studentList = studentRepository.findByIdBetWeenOderByIdDesc(1, 3);
		
		studentList = studentRepository.selectByDreamJob("개발자");
		
		
		return studentList;
		
	}
	
	
	
}
