package com.poobesh.pattern.factory;

import com.poobesh.models.AdminSingleton;
import com.poobesh.models.Person;
import com.poobesh.models.Student;
import com.poobesh.models.Teacher;
import com.poobesh.models.Worker;

public class PersonFactory {
	
	static int i = 0;
	public Person getObject(String name) {
		
		if(name.equalsIgnoreCase("student"))
		{
			return new Student(i++);
		}
		else if(name.equalsIgnoreCase("Teacher"))
		{
			return new Teacher(i++);
		}
		else if(name.equalsIgnoreCase("worker"))
		{
			return new Worker();
		}
		else if(name.equalsIgnoreCase("Admin"))
		{
			return AdminSingleton.INSTANCE.getInstance();
		}
		else
			return null;
	}

}
