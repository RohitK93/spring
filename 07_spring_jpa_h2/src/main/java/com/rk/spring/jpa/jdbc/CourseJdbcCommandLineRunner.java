package com.rk.spring.jpa.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.spring.jpa.bean.Course;
import com.rk.spring.jpa.bean.Course1;
import com.rk.spring.jpa.repository.CourseJdbcRepository;
import com.rk.spring.jpa.repository.CourseJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository courseJdbcRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		courseJdbcRepository.insertCourse();
		
		courseJdbcRepository.insertCourse(new Course(1, "Learn AWS by JDBC", "By RK" ));
		courseJdbcRepository.insertCourse(new Course(2, "Learn devops by JDBC", "By RK" ));
		courseJdbcRepository.insertCourse(new Course(3, "Learn devops by JDBC", "By RK" ));
		
		courseJdbcRepository.deleteCourse(1L);
		
		System.out.println("Second course user"+courseJdbcRepository.findById(2L));
		System.out.println("Third course user"+courseJdbcRepository.findById(3L));
	}

}
