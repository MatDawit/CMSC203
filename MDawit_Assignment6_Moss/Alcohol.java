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

public class Alcohol extends Beverage{
	
	private boolean isWeekend;
	private final double WEEKEND_PRICE = 0.6;

	public Alcohol(String alcoholName, SIZE size, boolean isWeekend) {
	    super(alcoholName, TYPE.ALCOHOL, size);
	    this.isWeekend = isWeekend;
	}

	public boolean isWeekend() {
	    return isWeekend;
	}

	public void setWeekend(boolean isWeekend) {
	    this.isWeekend = isWeekend;
	}

	public double getWeekendPrice() {
	    return WEEKEND_PRICE;
	}

	public String toString() {
	    String str = "" + getBevName() + ", " + getSize();
	    double bevPrice = 0.0;
	    boolean weekendFlag = isWeekend;
	    if (weekendFlag) 
	        str += ", weekend fee";
	    bevPrice = calcPrice();
	    str += ", price: $" + bevPrice;
	    return str;
	}

	public boolean equals(Alcohol a) {
	    boolean baseEquals = super.equals(a);
	    if (baseEquals && isWeekend == a.isWeekend())
	        return true;
	    return false;
	}

	public double calcPrice() {
	    double bevPrice = super.getBasePrice();
	    boolean weekendFlag = isWeekend;

	    if (super.getSize() == SIZE.MEDIUM)
	    	bevPrice += super.getSizeUp();
	    else if (super.getSize() == SIZE.LARGE)
	    	bevPrice += 2 * super.getSizeUp();

	    if (weekendFlag)
	    	bevPrice += WEEKEND_PRICE;

	    return bevPrice;
	}

	
}