package com.poobesh.models;

public class Worker extends Person {

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long salary) {
		this.amount = salary;
		
	}

}
