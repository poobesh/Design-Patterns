package com.poobesh.pattern.template;

public interface DailyRoutine {
	
	public default void morningWork() throws InterruptedException {
		registerAttendance();
		Thread.sleep(2000);
		getToWork();
		Thread.sleep(2000);
		intervalBreak();
		Thread.sleep(2000);
		getToWork();
		Thread.sleep(2000);
		LunchBreak();
		Thread.sleep(2000);
	}
	
	public default void afternoonWork() throws InterruptedException {
		getToWork();
		Thread.sleep(2000);
		intervalBreak();
		Thread.sleep(2000);
		getToWork();
		Thread.sleep(2000);
		registerLeaveAttendance();
	}

	public void registerLeaveAttendance();

	public void LunchBreak();

	public void intervalBreak();

	public void getToWork();

	public void registerAttendance();

}
