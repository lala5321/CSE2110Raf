/*

Program: Exercise3.java        Last Date of this Revision: April 12, 2022

Purpose: Create a Prime Number application that displays all prime numbers in a given range of numbers provided by user.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 //

*/

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
	
		{
			
			Scanner input = new Scanner (System.in);
			
			System.out.print("Please enter the the first number (Min Range): "); //Min Range
			
			int min = input.nextInt(); //Recording variable 'min'
			
			System.out.print("\nPlease enter the the second number (Max Range): "); //Max range
			
			int max = input.nextInt(); //Recording variable 'max'
			
			for(int a=min;a<= max;a++) { //Min and max prime number range
				
				if(isPrime(a)) { //Check if number is prime
	                System.out.println("Prime numbers between "+ min +" and "+ max +" are: " + a); //Output prime numbers in given range
				 }
	        }}
	    }
	     
	    public static boolean isPrime(int num) {    
	        for(int i = 2; i <= num/i; ++i) { 
	            if(num % i == 0) {
	                return false; //Boolean to determine prime number false or true
	            }
	        }
	        return true;
	    }}
			
		
/* Screen Dump

Please enter the the first number (Min Range): 1

Please enter the the second number (Max Range): 20
Prime numbers between 1 and 20 are: 1
Prime numbers between 1 and 20 are: 2
Prime numbers between 1 and 20 are: 3
Prime numbers between 1 and 20 are: 5
Prime numbers between 1 and 20 are: 7
Prime numbers between 1 and 20 are: 11
Prime numbers between 1 and 20 are: 13
Prime numbers between 1 and 20 are: 17
Prime numbers between 1 and 20 are: 19

*/




