/*

Program: RandomNum.java        Last Date of this Revision: March 20, 2022

Purpose: Create a RandomNum application that displays a random number in a range provided by user.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		{	
			 Scanner userinput = new Scanner(System.in);

			 System.out.print("Welcome to RandomNum! Please enter the the first number (Minimum Range): ");

			 int min = userinput.nextInt(); //Recording min

			 System.out.print("\nPlease enter the the second number (Maximum Range): ");

			 int max = userinput.nextInt(); //Recording max

			 int range = (max - min) + 1; //Formula for range that computer can pick from

			 int randomNum = (int) (Math.random() * range) + min; //RandomNum generator
			        
			        
			        System.out.println("\nRandomNum has picked the number: " + randomNum); //Output message of what random number has been picked in given range
	

	}

}}

/* Screen Dump

Welcome to RandomNum! Please enter the the first number (Minimum Range): 1

Please enter the the second number (Maximum Range): 20

RandomNum has picked the number: 3


*/