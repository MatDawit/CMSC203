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

import java.util.*;

public class Order implements OrderInterface, Comparable<Order>{
	
	private int orderNumber;
	private int time;
	private DAY day;
	private Customer customer;
	private ArrayList<Beverage> beverageList;
	
	public Order(int t, DAY d, Customer c) {
		orderNumber = randomNumber();
		time = t;
		day = d;
		customer = c;
		beverageList = new ArrayList<>();
	}
	
	public int getOrderNo() {
		return orderNumber;
	}
	
	public void setOrderNo (int number) {
		orderNumber = number;
	}
	
	public int getOrderTime() {
		return time;
	}
	
	public void setOrderTime(int orderTime) {
		time = orderTime;
	}
	
	public DAY getOrderDay() {
		return day;
	}
	
	public void setOrderDay(DAY orderDay) {
		day = orderDay;
	}
	
	public Customer getCustomer() {
		return new Customer(customer);
	}
	
	public void setCustomer(Customer customerName) {
		customer = customerName;
	}
	
	public ArrayList <Beverage> getBeverages(){
		return beverageList;
	}
	
	public int randomNumber() {
		
		Random random = new Random();
		int randomNum = 0;
		randomNum = random.nextInt(90000 - 10000);
		return randomNum;
	}

	@Override
	public int compareTo(Order orderNumb) {
		if (orderNumber == orderNumb.getOrderNo())
			return 0;
		else if (orderNumber < orderNumb.getOrderNo())
			return -1;
		else
			return 1;
	}

	@Override
	public boolean isWeekend() {
		
		boolean bool = false;
		if (day == DAY.SATURDAY)
			bool = true;
		if (day == DAY.SUNDAY)
			bool = true;
		
		return bool;
	}

	@Override
	public Beverage getBeverage(int itemNumber) {
		return beverageList.get(itemNumber);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE bevSize, boolean extraShot, boolean extraSyrup) {
		Coffee cofeeOrder = new Coffee(bevName, bevSize, extraShot, extraSyrup);
		beverageList.add(cofeeOrder);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE bevSize) {
		boolean bool = isWeekend();
		Alcohol alcoholOrder = new Alcohol(bevName, bevSize, bool);
		beverageList.add(alcoholOrder);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE bevSize, int numOfFruits, boolean addProtien) {
		Smoothie smoothieOrder = new Smoothie(bevName, bevSize, numOfFruits, addProtien);
		beverageList.add(smoothieOrder);
	}

	@Override
	public double calcOrderTotal() {
		double total = 0;
		for(Beverage beverage : beverageList) {
			total += beverage.calcPrice();
		}
		return total;
	}

	@Override
	public int findNumOfBeveType(TYPE type) {
		int numOfBeve = 0;
		for (Beverage beverage : beverageList) {
			if(beverage.getType() == type)
				numOfBeve++;
		}
		return numOfBeve;
	}
	
	
	public String toString() {
		String str = "Order number: " + orderNumber + ", " + time + " ," +  day + ", " + customer;
		for (Beverage beverage : beverageList)
			str += "\n" + beverage;
		str += ", total: " +calcOrderTotal();
		return str;
	}
	
	public int getTotalItems() {
		return beverageList.size();
	}

}