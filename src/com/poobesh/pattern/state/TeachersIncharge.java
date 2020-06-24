package com.poobesh.pattern.state;

public class TeachersIncharge implements State {

	TeachersPromotion teacher;
	
	public TeachersIncharge(TeachersPromotion teacher) {
		this.teacher = teacher;
	}

	@Override
	public void badReview() {
		System.out.println(" Bad review De-Promoting --> Class Teacher ");
		this.teacher.setCurrentState(this.teacher.getClassTeacher());

	}

	@Override
	public void verybadReview() {
		System.out.println(" Very Bad review De-Promoting --> Class Teacher ");
		this.teacher.setCurrentState(this.teacher.getClassTeacher());

	}

	@Override
	public void goodReview() {
		if(this.teacher.getExperience() >= 5)
		{
			System.out.println(" Good review and Exp >= 5 Promoting --> Senior Incharge ");
			this.teacher.setCurrentState(this.teacher.getSeniorIncharge());
		}
		else
		{
			System.out.println(" Good review but Exp < 5 so Nochange ");
			
		}
			

	}

	@Override
	public void completed1Year() {
		

	}


}
