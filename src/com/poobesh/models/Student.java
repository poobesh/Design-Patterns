package com.poobesh.models;

import com.poobesh.pattern.observer.Observer;

public class Student extends Person implements Observer {
	
	protected Teacher classTeacher;
    protected int classStandard;
    protected char section;
    protected int coStudentsCount;
    
	public Student(int i) {
		this.id = i;
	}

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long fees) {
		this.amount = fees;
	}
	@Override
	public void update(int numberOfStudents) {
		this.coStudentsCount = numberOfStudents;
		
	}
	
	

	public Teacher getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}

	public int getClassStandard() {
		return classStandard;
	}

	public void setClassStandard(int classStandard) {
		this.classStandard = classStandard;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}
	

	public int getCoStudentsCount() {
		return coStudentsCount;
	}

	public void setCoStudentsCount(int coStudentsCount) {
		this.coStudentsCount = coStudentsCount;
	}

	

	
	
	

}
