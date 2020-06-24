package com.poobesh.pattern.template;

import com.poobesh.models.Worker;

public class RamWorker extends Worker implements DailyRoutine {
	
	

	public RamWorker() {
		super();
		this.id=12345;
		this.name="Ram";
	}
	
	
	

	@Override
	public void registerLeaveAttendance() {
		System.out.println(" I am Leaving the Office ... Bye... :) ");
		
	}

	@Override
	public void LunchBreak() {
		System.out.println(" I am going to have my lunch ... ");
		
	}

	@Override
	public void intervalBreak() {
		System.out.println(" I am going to have a break for 15 minutes ...  :( ");
		
	}

	@Override
	public void getToWork() {
		System.out.println(" Hi all i am back to work :) ");
		
	}

	@Override
	public void registerAttendance() {
		System.out.println(" Hi All Good Morning i am Ram , Have a Good Day ... ");
		
	}

}
