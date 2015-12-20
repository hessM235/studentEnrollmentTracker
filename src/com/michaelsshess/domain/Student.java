package com.michaelsshess.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a Student enrolled in the college management system (CMS)
 */
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String enrollmentID;
	private String name;
	private String tutorName; // This will become a class soon

	// Required by Hibernate
	public Student() {

	}

	/**
	 * Initializes a student with a particular tutor
	 */
	public Student(String name, String tutorName) {
		this.name = name;
		this.tutorName = tutorName;
	}

	/**
	 * Initializes a student with no pre set tutor
	 */
	public Student(String name) {
		this.name = name;
		this.tutorName = null;
	}

	public double calculateGradePointAverage() {
		// some complex business logic!
		
		return 0;
	}
	
	public String toString(){
		return this.name;
	}
}
