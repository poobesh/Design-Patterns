package com.poobesh.pattern.adapter;

public class CocurricularsAdapter extends StudentTermMarks {

	CoCurriculars activity;
	
	@Override
	public void setName(String name) {
		this.name = activity.getCoCurricularsName();
	}
	
	

	@Override
	public int getSubjectCount() {
		return 1;
	}



	@Override
	public int getLanguage1Mark() {
		return activity.getMarks();
	}



	@Override
	public int getLanguage2Mark() {
		return 0;		
	}



	@Override
	public int getScienceMark() {
		return 0;
	}



	@Override
	public int getSocialMark() {
		return 0;
	}



	@Override
	public int getMathMark() {
		return 0;
	}



	public CoCurriculars getActivity() {
		return activity;
	}

	public void setActivity(CoCurriculars activity) {
		this.activity = activity;
	}

	
	
	

}
