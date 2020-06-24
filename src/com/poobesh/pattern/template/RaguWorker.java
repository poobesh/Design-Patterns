package com.poobesh.pattern.template;

import com.poobesh.models.Worker;

public class RaguWorker extends Worker implements DailyRoutine {
	
	public RaguWorker() {
		super();
		this.id=125;
		this.name="Ragu";
	}
	

	@Override
	public void registerLeaveAttendance() {
		System.out.println(" I am Leaving the Office ... Bye... :) ");
		
	}

	@Override
	public void LunchBreak() {
		//System.out.println(" I am going to play during my lunch break ... ");
		
	}

	@Override
	public void intervalBreak() {
		System.out.println(" I am going for a nap about 15 minutes ...  :( ");
		
	}

	@Override
	public void getToWork() {
		System.out.println(" Sorry I am Late  :( ");
		
	}

	@Override
	public void registerAttendance() {
		System.out.println(" Hi All Good Morning i am Ragu , Have a Good Day ... ");
		
	}

}
