package com.jsL.spring.ex.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsL.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
