package com.rk.spring.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rk.spring.jpa.bean.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			insert into course(id, name, author)
			values(1,'Learn AWS', 'AWS BY RK');
			""";
	
	private static String INSERT_DYNAMIC_QUERY = 
			"""
			insert into course(id, name, author)
			values(?,?, ?);
			""";
	
	private static String DELETE_COURSE =
			"""
			delete from course 
			where id =?
			""";
	
	private static String SELECT_QUERY = 
			"""
			select * from course where id = ?
			""";
			
	public void insertCourse() {
		jdbcTemplate.update(INSERT_QUERY);
	
	}
	
	public void insertCourse(Course Course) {
		jdbcTemplate.update(INSERT_DYNAMIC_QUERY, Course.getId(), Course.getName(), Course.getAuthor());
	}
	
	public void deleteCourse(long id) {
		jdbcTemplate.update(DELETE_COURSE, id);
	}
	
	public Course findById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
	
}
