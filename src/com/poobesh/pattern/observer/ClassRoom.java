package com.poobesh.pattern.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.poobesh.models.Person;
import com.poobesh.models.Student;
import com.poobesh.models.Teacher;
public class ClassRoom implements Observable {
	
	int classRoomId;
	Set<Student> students;
	Teacher teacher;
	List<Observer> list;
	int numberOfStudents;
	
	
	
	public ClassRoom() {
		super();
		
		this.students = new HashSet<Student>();
		this.list  = new ArrayList<Observer>();
	}

	// this function calls when a student or teacher is updated
	@Override
	public void addObserver(Observer observer) {
		this.list.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		this.list.remove(observer);
		
		System.out.println("Removed Observer : "+((Person) observer).getId()+
				" Index in List  : "+this.list.indexOf(observer));
	}

	@Override
	public void notifyAllObserver() {
		
		for(Observer o : list) {
			o.update(this.numberOfStudents);
		}
		
	}
	
	public int getClassRoomId() {
		return classRoomId;
	}
	public void setClassRoomId(int classRoomId) {
		this.classRoomId = classRoomId;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	// SET Students or Teacher
	
	public void setStudents(Student student) {
		//System.out.println(" Set Count B "+this.students.size());
		
		this.students.add(student);
		
		this.numberOfStudents = this.students.size();
		addObserver((Observer)student);
		notifyAllObserver();
	}
	
	public void removeStudent(Student student ) {
		this.students.remove(student);
		this.numberOfStudents = this.students.size();
		removeObserver(student);
		notifyAllObserver();
		
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		
	}

	
	

}
