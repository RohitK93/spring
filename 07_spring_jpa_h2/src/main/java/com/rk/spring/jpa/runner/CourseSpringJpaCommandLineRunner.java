package com.rk.spring.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.spring.jpa.bean.Course;
import com.rk.spring.jpa.bean.Course1;
import com.rk.spring.jpa.repository.CourseJdbcRepository;
import com.rk.spring.jpa.repository.CourseJpaRepository;
import com.rk.spring.jpa.spring.repository.CourseSpringDataJpaRepository;

@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository courseSpringDataJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		courseJdbcRepository.insertCourse();
		
		courseSpringDataJpaRepository.save(new Course1(1, "Learn AWS by Spring JPA", "By RK 1" ));
		courseSpringDataJpaRepository.save(new Course1(2, "Learn devops by Spring JPA", "By RK 1" ));
		courseSpringDataJpaRepository.save(new Course1(3, "Learn devops by Spring JPA", "By RK 1" ));
		
		courseSpringDataJpaRepository.deleteById(1L);
		
		System.out.println("Spring JPA Second course1 user"+courseSpringDataJpaRepository.findById(2L));
		System.out.println("Spring JPA Third course1 user"+courseSpringDataJpaRepository.findById(3L));
		
		System.out.println("Find All: "+courseSpringDataJpaRepository.findAll());
		System.out.println("Find cout: "+courseSpringDataJpaRepository.count());
		
		System.out.println("Find by author : "+courseSpringDataJpaRepository.findByAuthor("By RK 1"));
		
		System.out.println("Native query: "+courseSpringDataJpaRepository.getCourseDataById(2));
	}

}
