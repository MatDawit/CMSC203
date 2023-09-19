/*
 * Class: CMSC203 
 * Instructor: Tarek Ahmed
 * Description: (Give a brief description for each Class)
 * Due: 09/19/2023
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Mathew Iyob Dawit
*/






import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		
		// Variables
		int randNum;
		String computerGuess = "";
		String userGuess = "";
		int correctCounter = 10;
		
		// Introduction
		
		System.out.println("Enter you name: "); String name = input.nextLine();
		System.out.println("Describe yourself: "); String description = input.nextLine();
		System.out.println("Due Date: "); String date = input.nextLine();
		System.out.println("CMSC203 Assignment1: Test your ESP skills! ");
		
		for (int i = 1; i <= 10; i++) {
			
			// Color Randomizer
			
			randNum = rand.nextInt(5);
			
			if (randNum == 0) {
				computerGuess = "Red";
			} else if (randNum == 1) {
				computerGuess = "Green";
			} else if (randNum == 2) {
				computerGuess = "Blue";
			} else if (randNum == 3) {
				computerGuess = "Orange";
			} else if (randNum == 4){
				computerGuess = "Yellow";
			}
			
			// Question Loop
			
			System.out.println("Round " + i);
			
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			System.out.println("Enter your guess:"); userGuess = input.nextLine();
			
			// Incorrect Guess Loop
			
			if (computerGuess.equals(userGuess) == false) {
				correctCounter--;
				for (int x = 0; x <= 1; x++) {
					System.out.println("\nYou entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
					System.out.println("Enter your guess again:"); userGuess = input.nextLine();
					if (computerGuess.equals(userGuess) == true) {
						break;
					}
				}
			}
			
			
			
		
			
			
			System.out.println("\nI was thinking of " + computerGuess);
		
		}
		
		// Game Over
		
		System.out.print("Game Over\n");
		System.out.print("You guessed " + correctCounter + " out of 10 colors correctly.\n");
		
		System.out.println("Student Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + date);
		

	}

}
