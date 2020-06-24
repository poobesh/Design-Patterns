package com.poobesh.pattern.state;

public class SeniorIncharge implements State {

	TeachersPromotion teacher;
	public SeniorIncharge(TeachersPromotion teacher) {
		this.teacher = teacher;
	}

	@Override
	public void badReview() {
		System.out.println(" Bad review De-Promoting -->  Teacher's incharge ");
		this.teacher.setCurrentState(this.teacher.getTeachersIncharge());

	}

	@Override
	public void verybadReview() {
		System.out.println(" Very Bad review De-Promoting --> Class Teacher ");
		this.teacher.setCurrentState(this.teacher.getClassTeacher());

	}

	@Override
	public void goodReview() {
		System.out.println(" Good review NO State Change ");

	}

	@Override
	public void completed1Year() {
		

	}

	

}
