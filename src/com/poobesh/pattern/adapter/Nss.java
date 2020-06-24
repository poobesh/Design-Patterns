package com.poobesh.pattern.adapter;

public class Nss implements CoCurriculars {
	
	int markForInvolvement;
	
	@Override
	public String getCoCurricularsName() {
		return "Nss";
	}

	@Override
	public int getMarks() {
		
		return getMarkForActivityInvolvement();
	}
	
	public int getMarkForActivityInvolvement() {
		return markForInvolvement;
	}

	public void setMarkForActivityInvolvement(int markForActivityInvolvement) {
		this.markForInvolvement = markForActivityInvolvement;
	}


}
