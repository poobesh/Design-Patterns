package com.poobesh.models;

import java.util.List;
import java.util.Set;

import com.poobesh.pattern.observer.Observer;

public class Teacher extends Person implements Observer  {
	
	protected List<Student> students ;
	protected String qualification;
	protected Set<Integer> qualifiedForClasses;
	protected int numberOfStudents;
	

	public Teacher(int i) {
		this.id = i;
	}

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long salary) {
		this.amount = salary;
	}
	@Override
	public void update(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
		
	}
	
	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Set<Integer> getQualifiedForClasses() {
		return qualifiedForClasses;
	}

	public void setQualifiedForClasses(Set<Integer> qualifiedForClasses) {
		this.qualifiedForClasses = qualifiedForClasses;
	}
	

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	


}
