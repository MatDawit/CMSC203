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

public class Smoothie extends Beverage{
	
	private int fruit;
	private final double FRUIT_PRICE = 0.5;
	private boolean protein;
	private final double PROTEIN_PRICE = 1.5;
	
	public Smoothie (String name, SIZE s, int fruits, boolean p) {
		super(name, TYPE.SMOOTHIE, s);
		fruit = fruits;
		protein = p;
	}
	
	public int getNumOfFruits() {
		return fruit;
	}
	
	public void setNumOfFruits(int fruitsNum) {
		fruit = fruitsNum;
	}
	
	public boolean getAddProtien() {
		return protein;
	}
	
	public void setAddProtein(boolean p) {
		protein = p;
	}
	
	public double getFruitPrice() {
		return FRUIT_PRICE;
	}
	
	public double getProteinPrice() {
		return PROTEIN_PRICE;
	}
	
	public String toString() {
		boolean bool = protein;
		double price = 0.0;
		String string = "" + getBevName() + ", " + getSize() + ", fruits: " + fruit;
		if (bool == true) {
			string += ", protein";
		}
		price = calcPrice();
		string += ", price: $" + price;
		return string;
	}
	
	public boolean equals(Smoothie smoothie) {
		boolean bool = super.equals(smoothie);
		if(bool = true) {
			if (fruit == smoothie.getNumOfFruits() && protein == smoothie.getAddProtien())
				return bool;
		}
			return false;	
	}
	
	public double calcPrice() {
		
		double price = super.getBasePrice();
		
		if(super.getSize() == SIZE.MEDIUM)
			price += super.getSizeUp();
		else if (super.getSize() == SIZE.LARGE)
			price += 2 * super.getSizeUp();
		
		double fruitTotal = FRUIT_PRICE * getNumOfFruits();
		price += fruitTotal;
		boolean bool = protein;
		if (bool == true)
			price += PROTEIN_PRICE;
		
		return price;
	}
	
	

}