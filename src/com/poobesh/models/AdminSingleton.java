package com.poobesh.models;

public enum AdminSingleton {
	INSTANCE;
	
	private Admin admin = new Admin();
	
	public Admin getInstance() {
		return admin;
	}

}
class Admin extends Person {
	
	protected String userName = "MyUserName";
	protected String password = "MyPassword";
	protected static int  i = 0;
	
	
	
	public Admin() {
		super();
		i++;
	}

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long availableFund) {
		this.amount = availableFund;
		
	}

}