package com.rk.spring.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rk.spring.jpa.bean.Course1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insertCourse1(Course1 course1) {
		entityManager.merge(course1);
	}
	
	public Course1 findById(long id) {
		return entityManager.find(Course1.class, id);
	}
	
	public void deleteById(long id) {
		Course1 course1 = entityManager.find(Course1.class, id);
		entityManager.remove(course1);
	}
}
