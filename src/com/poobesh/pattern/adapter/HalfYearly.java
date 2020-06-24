package com.poobesh.pattern.adapter;

public class HalfYearly extends StudentTermMarks {
	
	public HalfYearly() {
		super(5 , 90 , 95 , 79, 89, 98);
	}

	@Override
	public void setName(String name) {
		this.name = "Half Yearly Exam";
	}
	
}
