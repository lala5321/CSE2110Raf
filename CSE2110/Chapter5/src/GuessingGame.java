/*

Program: GuessingGame.java        Last Date of this Revision: March 29, 2022

Purpose: Create a GuessingGame application that prompts users for a range of numbers where they have to guess the random computer generated number till they get it right.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		

		{
			
			Scanner input = new Scanner (System.in);
	
			System.out.print("Welcome to GuessingGame! Please enter the the first number (Min Range): ");//ask for first random number in minimum range

			int min = input.nextInt();//record first number in minimum range

			System.out.print("\nPlease enter the the second number (Max Range): ");//ask for second number in maximum range

			int max = input.nextInt();//record second number in maximum range

			int range = (max - min) + 1;//to determine the range of numbers that the computer can pick from

			
			System.out.println("\nGuess the secret number between " + min + " and " + max + ": "); //User tries to guess secret number
			
			int guess = input.nextInt();
			
			String userInput = "c"; 
			
			while (!(userInput.equalsIgnoreCase("q"))) //Loop to keep guessing till winning
			{   
		
				int randomNum = (int) (Math.random() * range) + min; //final formula for computer to pick random number.
			  
			     if (guess == randomNum)
			     {
			    	 System.out.println("\nYou won!"); //User guessed correct number
			     }
			     
			
			     else if (guess != randomNum)
			     {
			    	 System.out.println("\nThe secret number was " + randomNum + ". Try again."); 
			     }
			
			     	guess = input.nextInt(); //User needs to try again
			}

			
}
	
	

	
	}
	
}

/* Screen Dump

Welcome to GuessingGame! Please enter the the first number (Min Range): 1

Please enter the the second number (Max Range): 20

Guess the secret number between 1 and 20: 
15

The secret number was 5. Try again.
4

The secret number was 20. Try again.
13

The secret number was 9. Try again.
17

The secret number was 14. Try again.


*/



