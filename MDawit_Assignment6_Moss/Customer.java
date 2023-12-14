/* 
* Class: CMSC203 
* Instructor: Ahmed Tarek
* Description: Program that creates a beverage shop that uses inheritence and subclasses.
* 
* Due: 12/8/2023
* Platform/compiler: Eclipse
* I pledge that I have completed the programming assignment  
* independently. I have not copied the code from a student or   
* any source. I have not given my code to any student. 
* Print your Name here: Mathew Dawit
*/ 

public class Customer {
	
	private String name;
	private int age;
	
	public Customer(String n, int a) {
		name = n;
		age = a;
	}
	
	public Customer(Customer c) {
		name = c.getName();
		age = c.getAge();
	}
	
	public Customer() {}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}
	
	public String toString() {
		String str = "Name: " + name + ", Age: " + age;
		return str;
	}
}