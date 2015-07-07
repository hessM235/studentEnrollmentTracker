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
		// we won't need this method on the course, BUT it is import
		// to remember that classes aren't just get/set pairs - we expect
		// business logic in here as well.
		return 0;
	}
	
	public String toString(){
		return this.name;
	}
}
