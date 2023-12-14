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

public class Coffee extends Beverage {

    private boolean hasExtraShot;
    private final double SHOT_PRICE = 0.5;
    private boolean hasExtraSyrup;
    private final double SYRUP_PRICE = 0.5;

    public Coffee(String coffeeName, SIZE s, boolean extraShot, boolean extraSyrup) {
        super(coffeeName, TYPE.COFFEE, s);
        hasExtraShot = extraShot;
        hasExtraSyrup = extraSyrup;
    }

    public boolean hasExtraShot() {
        return hasExtraShot;
    }

    public void setExtraShot(boolean extraShot) {
        hasExtraShot = extraShot;
    }

    public boolean hasExtraSyrup() {
        return hasExtraSyrup;
    }

    public void setExtraSyrup(boolean extraSyrup) {
        hasExtraSyrup = extraSyrup;
    }

    public double getShotPrice() {
        return SHOT_PRICE;
    }

    public double getSyrupPrice() {
        return SYRUP_PRICE;
    }

    public String toString() {
        double price = 0.0;
        String string = "" + getBevName() + ", " + getSize();

        if (hasExtraShot) {
        	string += ", extra shot";
            if (hasExtraSyrup) {
            	string += ", extra syrup";
            }
            price = calcPrice();
            string += ", price: $" + price;
            return string;
        }

        if (hasExtraSyrup) {
        	string += ", extra syrup";
        }

        price = calcPrice();
        string += ", price: $" + price;
        return string;
    }

    public double calcPrice() {
        double price = super.getBasePrice();

        if (super.getSize() == SIZE.MEDIUM) {
            price += super.getSizeUp();
        } else if (super.getSize() == SIZE.LARGE) {
            price += 2 * super.getSizeUp();
        }

        if (hasExtraShot) {
            price += SHOT_PRICE;
        }

        if (hasExtraSyrup) {
            price += SYRUP_PRICE;
        }

        return price;
    }

    public boolean equals(Coffee coffee) {
        boolean baseEquals = super.equals(coffee);
        if (baseEquals) {
            return hasExtraShot == coffee.hasExtraShot() && hasExtraSyrup == coffee.hasExtraSyrup();
        }
        return false;
    }
}
