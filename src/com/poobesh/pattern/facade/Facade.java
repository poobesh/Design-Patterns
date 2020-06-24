package com.poobesh.pattern.facade;

import java.util.List;

import com.poobesh.models.Student;
import com.poobesh.models.Teacher;
import com.poobesh.models.Worker;

public class Facade {
	
	List<Student> students;
	Teacher classTeacher;
	List<Worker> workers;
	
	public Facade() {
		super();
	}
	public Facade(List<Student> students, Teacher classTeacher, List<Worker> workers) {
		super();
		this.students = students;
		this.classTeacher = classTeacher;
		this.workers = workers;
	}
	
	public void attendanceCall() {
		for(Student s : students) {
			System.out.println("Student Id : "+s.getId()+" Student Name : "+s.getName()+ " is Present .");
		}
	}
	
	public void getWorkersForThisClass() {
		for(Worker w : workers) {
			System.out.println(" Worker Id : "+w.getId()+" Name : "+w.getName());
		}	
	}
	
	public void getClassTeacherName() {
		System.out.println(" Teacher Id : "+this.classTeacher.getId()+" Name : "+this.classTeacher.getName());
	}

}
