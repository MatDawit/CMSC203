/* 

Class: CMSC203 CRN 23103  
Program: Lab 1 
Instructor: Ahmed Tarek  
Summary of Description: Uses a movie driver and movie data element driver to test a class
Due Date: 09/28/23 
Integrity Pledge: I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source.  
Student’s Name: Mathew Dawit

 */

import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		boolean newMovie = true;

        while (newMovie) {
			Movie movie = new Movie();
			
			System.out.println("Enter a movie name: "); 
			String userIn = input.nextLine();
			movie.setTitle(userIn);
			
			System.out.println("Enter your rating for the movie " + userIn + ": "); 
			userIn = input.nextLine();
			movie.setRating(userIn);
			
			System.out.println("How many tickets did they sell at the theater: ");
			int tickets = input.nextInt();
			movie.setSoldTickets(tickets);
			
            input.nextLine();
            System.out.println(movie.toString());
			
			System.out.println("Do you want to add more movies?(y or n)");
            String answer = input.nextLine();
            newMovie = answer.equals("y");
			
    	}
        
        System.out.println("Goodbye");
	    input.close();
		    
	}
}
