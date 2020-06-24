package com.poobesh.pattern.state;

public class ClassTeacher implements State {

	TeachersPromotion teacher;
	public ClassTeacher(TeachersPromotion teacher) {
		this.teacher = teacher;
	}

	@Override
	public void badReview() {
		System.out.println(" Bad Review No state change ");

	}

	@Override
	public void verybadReview() {
		System.out.println(" Very Bad Review No State Change ");

	}

	@Override
	public void goodReview() {
		System.out.println(" Good review State Change --> Teacher's Incharge ");
		this.teacher.setCurrentState(this.teacher.getTeachersIncharge());

	}

	@Override
	public void completed1Year() {
		System.out.println();

	}

	

}
