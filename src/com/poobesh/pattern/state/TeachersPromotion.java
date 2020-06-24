package com.poobesh.pattern.state;

import com.poobesh.pattern.facade.SubjectTeacher;

public class TeachersPromotion {
	
	int experience ;
	State subjectTeacher;
	State classTeacher;
	State teachersIncharge;
	State seniorIncharge;
	
	State currentState ;

	
	public TeachersPromotion( ) {
		super();
		this.experience = 0;
		this.subjectTeacher = new SubjectTeacher(this);
		this.classTeacher = new ClassTeacher(this);
		this.teachersIncharge = new TeachersIncharge(this);
		this.seniorIncharge = new SeniorIncharge(this);
		this.currentState = this.subjectTeacher;
	}
	
	public void badReview() {
		this.currentState.badReview();
	}
	public void veryBadReview() {
		this.currentState.verybadReview();
	}
	public void goodReview() {
		this.currentState.goodReview();
	}
	public void completed1year() {
		this.currentState.completed1Year();
	}

	public void printCurrentState() {
		
		if(this.currentState instanceof SubjectTeacher)
			System.out.println(" Subject Teacher");
		else if(this.currentState instanceof ClassTeacher)
			System.out.println(" Class Teacher");
		else if(this.currentState instanceof TeachersIncharge)
			System.out.println(" Teacher's Incharge");
		else 
			System.out.println(" Senior Incharge");
	}
	
	 
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	public State getSubjectTeacher() {
		return subjectTeacher;
	}
	public State getClassTeacher() {
		return classTeacher;
	}
	public State getTeachersIncharge() {
		return teachersIncharge;
	}
	public State getSeniorIncharge() {
		return seniorIncharge;
	}
	
	

}
