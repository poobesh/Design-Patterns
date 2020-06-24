package com.poobesh.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.poobesh.models.Person;
import com.poobesh.models.Student;
import com.poobesh.models.Teacher;
import com.poobesh.models.Worker;
import com.poobesh.pattern.adapter.CoCurriculars;
import com.poobesh.pattern.adapter.CocurricularsAdapter;
import com.poobesh.pattern.adapter.HalfYearly;
import com.poobesh.pattern.adapter.MarksCalculator;
import com.poobesh.pattern.adapter.Nss;
import com.poobesh.pattern.decorator.Athlete;
import com.poobesh.pattern.decorator.CoCurricularsDecorator;
import com.poobesh.pattern.decorator.Swimmer;
import com.poobesh.pattern.facade.Facade;
import com.poobesh.pattern.factory.PersonFactory;
import com.poobesh.pattern.iterator.Iterator;
import com.poobesh.pattern.iterator.StudentArrayListIterator;
import com.poobesh.pattern.observer.ClassRoom;
import com.poobesh.pattern.observer.Observer;
import com.poobesh.pattern.state.TeachersPromotion;
import com.poobesh.pattern.template.DailyRoutine;
import com.poobesh.pattern.template.RaguWorker;
import com.poobesh.pattern.template.RamWorker;

public class SchoolManagementMain {

	private static Scanner scan;

	public static void main(String[] args) {
		
		System.out.println("Enter your option ");
		scan = new Scanner(System.in);
		
		
		// For Factory Pattern  ' Creates new Object based on given inputs '
		{
			System.out.println(new PersonFactory().getObject(scan.next()).getId());
			System.out.println(new PersonFactory().getObject(scan.next()).getId());
			System.out.println(new PersonFactory().getObject(scan.next()).getId());
			System.out.println(new PersonFactory().getObject(scan.next()).getId());
		}
		
		// For Observer Pattern ' On Addtion or Deletion of Student the student count for all 
		// Observers are updated simultaneously '
		
		{
			ClassRoom c = new ClassRoom();
			PersonFactory p = new PersonFactory();
			
			Person teacher  = p.getObject("teacher");
			c.addObserver((Observer) teacher);
			
			// Add a new Student
			Person s1 = p.getObject("student");
			c.setStudents((Student)s1);
			
			// Since Teacher is a observer get the count of the Observer
			System.out.println(" Students Count For Teacher ("+c.getStudents().size() + ") : "+ ((Teacher)teacher).getNumberOfStudents());
			
			// Add a New 2nd Student 
			Person s2 = p.getObject("student");
			c.setStudents((Student)s2);
			c.setStudents((Student)s1);
			// Since Teacher is a observer get the count of the Observer
			System.out.println(" Students Count For Teacher ("+c.getStudents().size() + ") : "+ ((Teacher)teacher).getNumberOfStudents());
			System.out.println(" Students Count For Student ("+c.getStudents().size() + ") : "+ ((Student) s2).getCoStudentsCount() );

			// Remove a 2nd Student s2
			
			c.removeStudent((Student)s2);
			System.out.println(" Students Count For Teacher ("+c.getStudents().size() + ") : "+ ((Teacher)teacher).getNumberOfStudents());
			System.out.println(" Students Count For Student ("+c.getStudents().size() + ") : "+ ((Student) s1).getCoStudentsCount() );

			
		}
		 
		
		// For Decorator a student can be swimmer or athlete or both
		
		{
			PersonFactory factory = new PersonFactory();
			Student s3 = (Student) factory.getObject("Student");
			
			Person personDecorator = new Athlete(s3);
			personDecorator = new Swimmer(personDecorator);
			personDecorator = new Swimmer(personDecorator);
			personDecorator = new Athlete(personDecorator);
			
			System.out.println(" Decorator "+((CoCurricularsDecorator)personDecorator).activityDescription());
			
		}
		
		// For Adapter Pattern Calculating marks & percentage for Activity and Theoritical Marks
		
		{
			HalfYearly marks = new HalfYearly(); // Default Values are initialized 
			
			// Calculator for Half Yearly Marks 
			MarksCalculator calc = new MarksCalculator(marks);
			System.out.println(" Sum of All Subject Marks : "+ calc.sum());
			System.out.println(" Percentage of All Marks  : "+ calc.precentage());
			
			// Calculator for Activity Marks
			
			Nss nss = new Nss();
			nss.setMarkForActivityInvolvement(89);
			
			CocurricularsAdapter adapter = new CocurricularsAdapter();
			adapter.setActivity(nss);
			calc = new MarksCalculator(adapter);
			System.out.println(" Sum of All Subject Marks : "+ calc.sum());
			System.out.println(" Percentage of All Marks  : "+ calc.precentage());			
			
		}
		
		// Template Pattern In this the daily routine of the workers are printed
		
		{
			Worker ram = new RamWorker();
			Worker ragu = new RaguWorker();
				System.out.println("\n Ram Says ... ");
				Thread t1 = new Thread() {

					public void run() {
						try {
							((DailyRoutine) ram).morningWork();
							((DailyRoutine) ram).afternoonWork();
						} catch (InterruptedException e) {
							System.out.println("Something Failed in Thread Sleep Function ... ");
						}

					}

				};
				Thread t2 = new Thread() {
					
					public void run() {
						try {
							((DailyRoutine) ragu).morningWork();
							((DailyRoutine) ragu).afternoonWork();
						} catch (InterruptedException e) {
							System.out.println("Something Failed in Thread Sleep Function ... ");
						}
						
					}
					
				};
				t1.start();
				t2.start();
				
				try {
					t1.join();
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		} 
		
		// Iterator Pattern iterate through arrayList of Objects
		
		{
			PersonFactory pFactoryIterator = new PersonFactory();
			
			int i=0;
			ArrayList<Object> personList = new ArrayList<Object>();
			while(i <= 5)
			{
				Person temp = pFactoryIterator.getObject("Student");
				temp.setId(i);
				personList.add(temp);
				System.out.println("Added Student : "+temp.getId());
				i++;
			}
			while(i <= 8)
			{
				Person temp = pFactoryIterator.getObject("teacher");
				temp.setId(i);
				personList.add(temp);
				System.out.println("Added teacher : "+temp.getId());
				i++;
			}
			System.out.println("Size Of Array List : "+personList.size());
			
			StudentArrayListIterator iterator = new StudentArrayListIterator();
			iterator.setItems(personList);
			
			while(iterator.hasNext())
			{
				System.out.println(" Id : "+ ((Person)iterator.next()).getId());
			}
		}
		
		// Facade Pattern Create a classRoom with Students, Teachers and Two Workers
		
		
		{
			List<Student> students = new ArrayList<Student>();
			List<Worker> workers = new ArrayList<Worker>();
			
			int i = 0;
			PersonFactory pFactoryIterator = new PersonFactory();
			Teacher teacher = (Teacher) pFactoryIterator.getObject("Teacher");
			teacher.setId(100);
			teacher.setName("Teacher");
			
			while(i <= 5)
			{
				Person temp = pFactoryIterator.getObject("Student");
				temp.setId(i);
				temp.setName("Student"+i);
				students.add((Student) temp);
				System.out.println("Added Student : "+temp.getId());
				i++;
			}
			while(i <= 8)
			{
				Person temp = pFactoryIterator.getObject("worker");
				temp.setId(i);
				temp.setName("Worker"+i);
				workers.add((Worker) temp);
				System.out.println("Added Worker : "+temp.getId());
				i++;
			}
			Facade facade = new Facade(students,teacher,workers);
			
			facade.getClassTeacherName();
			facade.attendanceCall();
			facade.getWorkersForThisClass();
			
		}
		
		// State Pattern 
		
		{
			TeachersPromotion promotion=  new TeachersPromotion();
			
			promotion.goodReview();
			promotion.printCurrentState();
			promotion.setExperience(4);
			promotion.goodReview();
			promotion.completed1year();
			promotion.printCurrentState();
			promotion.goodReview();
			promotion.printCurrentState();
			promotion.veryBadReview();
			promotion.printCurrentState();
			promotion.goodReview();
			promotion.printCurrentState();
			promotion.goodReview();
			promotion.printCurrentState();
			promotion.goodReview();
			promotion.printCurrentState();
			
			promotion.setExperience(6);
			promotion.goodReview();
			promotion.printCurrentState();
			promotion.goodReview();
			promotion.printCurrentState();
			promotion.veryBadReview();
			promotion.printCurrentState();
			
			System.out.println(" \n \n \n For 2 nd promotion ");
			TeachersPromotion promotion1=  new TeachersPromotion();
			
			promotion1.badReview();
			promotion1.printCurrentState();
			promotion1.setExperience(6);
			promotion1.completed1year();
			promotion1.printCurrentState();
			
			
		}
		
		
	}

}
