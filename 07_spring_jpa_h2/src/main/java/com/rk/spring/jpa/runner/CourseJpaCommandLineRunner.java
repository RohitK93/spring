package com.rk.spring.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.spring.jpa.bean.Course;
import com.rk.spring.jpa.bean.Course1;
import com.rk.spring.jpa.repository.CourseJdbcRepository;
import com.rk.spring.jpa.repository.CourseJpaRepository;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepository courseJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		courseJdbcRepository.insertCourse();
		
		courseJpaRepository.insertCourse1(new Course1(1, "Learn AWS by JPA", "By RK 1" ));
		courseJpaRepository.insertCourse1(new Course1(2, "Learn devops by JPA", "By RK 1" ));
		courseJpaRepository.insertCourse1(new Course1(3, "Learn devops by JPA", "By RK 1" ));
		
		courseJpaRepository.deleteById(1L);
		
		System.out.println("Second course1 user"+courseJpaRepository.findById(2L));
		System.out.println("Third course1 user"+courseJpaRepository.findById(3L));
	}

}
