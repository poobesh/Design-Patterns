package com.poobesh.pattern.adapter;

public class MarksCalculator {
	
	protected StudentTermMarks t;
	protected int total ;
		
	public MarksCalculator() {
		super();
	}
	
	public MarksCalculator(StudentTermMarks t) {
		super();
		this.t = t;
		this.total = t.getLanguage1Mark()+t.getLanguage2Mark()+t.getMathMark()
		+t.getScienceMark()+t.getSocialMark() ;
	}


	public int sum() {
		return total;
	}
	public float precentage () {
		int total_marks = t.getSubjectCount()*100;
		//System.out.println("Total Marks + "+total_marks + "  "+((float)total/ total_marks)*100 );
		return (((float)total/ total_marks)*100);
	}
	

}
