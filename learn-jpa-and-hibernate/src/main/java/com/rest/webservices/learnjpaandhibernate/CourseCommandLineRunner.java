package com.rest.webservices.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rest.webservices.learnjpaandhibernate.jpa.CourseJpaRepository;
import com.rest.webservices.learnjpaandhibernate.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepositry respositry;
	
//	@Autowired
//	private CourseJpaRepository respositry;
	
	
	@Autowired
	private CourseSpringDataJpaRepository respositry;
	
	
	@Override
	public void run(String... args) throws Exception{
		respositry.save(new Course(1,"Java jpa","youtube"));
		respositry.save(new Course(2,"Java1 jpa","youtube"));
		respositry.save(new Course(3,"Java2 jpa","youtube"));
		
		respositry.deleteById(1l);
		System.out.println(respositry.findById(2l));
		System.out.println(respositry.findById(3l));
		
		System.out.println(respositry.findAll());
		System.out.println(respositry.count());
		
		System.out.println(respositry.findByAuthor("youtube"));
		System.out.println(respositry.findByAuthor(""));
		
		System.out.println(respositry.findByName("Java jpa"));
		System.out.println(respositry.findByName(""));
	}
}
