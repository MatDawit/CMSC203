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

public abstract class Beverage {
	
	private String name;
	private TYPE type;
	private SIZE size;
	private final double PRICE = 2.0;
	private final double SIZE_UP = 1.0;
	
	public Beverage(String bevName, TYPE coffee, SIZE bevSize) {
		name = bevName;
		type = coffee;
		size = bevSize;
	}
	
	public abstract double calcPrice();
	
	public String getBevName() {
		return name;
	}
	
	public void setBevName(String bevName) {
		name = bevName;
	}
	
	public TYPE getType() {
		return type;
	}
	
	public void setType(TYPE bevType) {
		type = bevType;
	}
	
	public SIZE getSize() {
		return size;
	}
	
	public void setBeverageSize(SIZE bevSize) {
		size = bevSize;
	}
	
	public double getBasePrice() {
		return PRICE;
	}
	
	public double getSizeUp() {
		return SIZE_UP;
	}
	
	public String toString() {
		return name + ", " + size;
	}
	
	public boolean equals(Beverage beverage) {
		if(name.equals(beverage.getBevName())) {
			if (size == beverage.getSize() && type == beverage.getType()) 
					return true;
		}
		return false;	
	}
	
	

}