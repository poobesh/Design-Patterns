package com.poobesh.pattern.decorator;

import com.poobesh.models.Person;
import com.poobesh.models.Student;

public class Athlete extends CoCurricularsDecorator {

	Person person;
	
	public Athlete(Person s) {
		this.person = s;
	}

	@Override
	public String activityDescription() {
		String str = "";
		
		if(person instanceof Student) {
			str = "Student of Id : "+person.getId()+" Is a "+ ", Athlete ";			
		}
		else
			str = ((CoCurricularsDecorator)person).activityDescription() + " , Athlete";
		return str;		
	}

	@Override
	public long getAmount() {
		return 0;
	}

	@Override
	public void setAmount(long amount) {
		
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	

}
