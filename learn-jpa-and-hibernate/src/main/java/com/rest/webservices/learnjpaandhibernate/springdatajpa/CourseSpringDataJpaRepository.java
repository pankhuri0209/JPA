package com.rest.webservices.learnjpaandhibernate.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.learnjpaandhibernate.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
