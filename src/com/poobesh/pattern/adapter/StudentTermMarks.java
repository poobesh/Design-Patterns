package com.poobesh.pattern.adapter;

public abstract class StudentTermMarks {
	
	private int subjectCount;
	private int language1Mark;
	private int language2Mark;
	private int scienceMark;
	private int socialMark;
	private int mathMark;
	
	protected String name; // Exam name Half yearly or Annual ...
	
	
	public StudentTermMarks() {
		super();
		
	}

	public StudentTermMarks(int subjectCount, int language1Mark, int language2Mark, int scienceMark, int socialMark,
			int mathMark) {
		super();
		this.subjectCount = subjectCount;
		this.language1Mark = language1Mark;
		this.language2Mark = language2Mark;
		this.scienceMark = scienceMark;
		this.socialMark = socialMark;
		this.mathMark = mathMark;
		
	}

	public String getName() {
		return name;
	}
	
	public abstract void setName(String name);
	
	public int getSubjectCount() {
		return subjectCount;
	}

	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}

	public int getLanguage1Mark() {
		return language1Mark;
	}

	public void setLanguage1Mark(int language1Mark) {
		this.language1Mark = language1Mark;
	}

	public int getLanguage2Mark() {
		return language2Mark;
	}

	public void setLanguage2Mark(int language2Mark) {
		this.language2Mark = language2Mark;
	}

	public int getScienceMark() {
		return scienceMark;
	}

	public void setScienceMark(int scienceMark) {
		this.scienceMark = scienceMark;
	}

	public int getSocialMark() {
		return socialMark;
	}

	public void setSocialMark(int socialMark) {
		this.socialMark = socialMark;
	}

	public int getMathMark() {
		return mathMark;
	}

	public void setMathMark(int mathMark) {
		this.mathMark = mathMark;
	}

}
