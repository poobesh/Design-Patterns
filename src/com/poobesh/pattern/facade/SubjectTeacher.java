package com.poobesh.pattern.facade;

import com.poobesh.pattern.state.State;
import com.poobesh.pattern.state.TeachersPromotion;

public class SubjectTeacher implements State {
	
	TeachersPromotion teacher ;
	boolean flag = false;
	
	public SubjectTeacher() {
		super();
		
	}

	public SubjectTeacher(TeachersPromotion teacher) {
		super();
		this.teacher = teacher;
	}

	@Override
	public void badReview() {
		System.out.println(" Bad Review setting state to --> Subject Teacher");
		flag = true;
		
	}

	@Override
	public void verybadReview() {
		System.out.println(" Bad Review setting state to --> Subject Teacher");
		flag = true;
	}

	@Override
	public void goodReview() {
		System.out.println(" Good Review Nothing Happens ");
		
	}

	@Override
	public void completed1Year() {
		System.out.println(" Completed 1 year changing state --> Class Teacher");
		if(flag != true)
			this.teacher.setCurrentState(this.teacher.getClassTeacher());
		else
			System.out.println(" Since got a very bad review in early stage teacher can't be promoted blocked from Promotions ");
	}

	

}
