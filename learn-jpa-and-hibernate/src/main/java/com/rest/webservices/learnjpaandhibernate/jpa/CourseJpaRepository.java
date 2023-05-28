package com.rest.webservices.learnjpaandhibernate.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.webservices.learnjpaandhibernate.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

@Autowired	
private	EntityManager entityManager;

public void insert(Course course)
{
	entityManager.merge(course);
}

public Course findById(long id)
{
	return entityManager.find(Course.class,id);
	}
public void deleteById(long id)
{
	Course course= entityManager.find(Course.class,id);
	entityManager.remove(course);
	}
}
