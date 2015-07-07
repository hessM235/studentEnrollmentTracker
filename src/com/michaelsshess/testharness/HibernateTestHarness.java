package com.michaelsshess.testharness;

import org.hibernate.Session;

import com.michaelsshess.domain.Student;

public class HibernateTestHarness {

	public static void main(String[] args){
		Student student = new Student("Testy McTester", "Test McTutor");
		
		System.out.println(student);
		
		//save student to database
		
		Session session;
		
		session.save(student);
	}
	
	
}
