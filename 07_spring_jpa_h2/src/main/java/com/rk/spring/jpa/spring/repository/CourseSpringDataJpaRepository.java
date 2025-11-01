package com.rk.spring.jpa.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rk.spring.jpa.bean.Course1;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course1, Long> {
	
	public List<Course1> findByAuthor(String author);
	
	
	@Query(nativeQuery = true, value = "select * from Course1 where id= :id")
	public List<Course1> getCourseDataById(long id);
	
	@Query(nativeQuery = true, value = "select * from Course1 where id= :id")
	public List<Course1> getCourseDataById1(@Param("id") long id);
}
