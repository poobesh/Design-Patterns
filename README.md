# Design-Patterns
Implemented Few Design patterns in School Management System

# Design Patterns Implemeted 
  1) Singleton
  2) Factory
  3) Observer
  4) Adapter
  5) Template
  6) Iterator
  7) Facade
  8) State
  9) Decorator

# Objects
  * Student
  * Teacher
  * Workers
  * Admin
  
# Singleton Pattern
  In this project only a single admin instance is called whenever requested . Singleton is implemeted using Enum .
  
# Factory Pattern
  Factory class provides people objects such as ( Student , Teacher , Worker , Admin ) when requested .

# Observer Pattern
  Here students are subscribers and classroom is the observer . When ever new student is added are removed the subscribed values ( co-students field in Students are updated ).
  
# Adapter Pattern
  This contains a calculator class for calculating total , percentage of given term-marks . It accepts only term marks class . But we have marks for co-curriculars such as ( NSS  ). These marks also should be calculated . We use  *Cocurriculars adapter* class for calculating marks for cocurriculars . (i.e) Using same *calculator* class for different type of objects * Cocurriculars and Term marks * .
  
# Template Pattern
  Templated pattern describes the daily routines of two workers (Ram , Ragu).
  
# Iterator Pattern
  Iterator pattern is used to navigate through list of persons (Student , Teacher , Worker , Admin ).

# Facade Pattern
  Facade pattern creates a classroom with 5 students , a class teacher and 2 workers .

# State Pattern
  State pattern is used to decide the promotion of a teacher based on certain actions such as good review , 1 year completion , bad review , very bad review . Based on these action states (i.e) designation of a teacher is decided .
  
# Decorator Pattern
  In this a student can be an athelete or swimmer . (i.e) A student object is decorated with Swimmer and/or Athlete decorator's .
  
