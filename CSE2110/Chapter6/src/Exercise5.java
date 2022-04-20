/*

Program: Exercise5.java        Last Date of this Revision: April 12, 2022

Purpose: Create an Add Coins application that displays total dollar amount from quarters, nickels, dimes, and pennies which are all provided by user.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter your total coins:"); //Prompting users to enter each coin amount

	    System.out.print("\nQuarters: ");
	    int Q1 = input.nextInt(); //Recording Quarters 

	    System.out.print("Dimes: "); 
	    int D1 = input.nextInt(); //Recording Dimes

	    System.out.print("Nickels: "); 
	    int N1 = input.nextInt(); //Recording Nickels

	    System.out.print("Pennies: "); 
	    int P1 = input.nextInt(); //Recording Pennies

	      
	  DecimalFormat fmt = new DecimalFormat("$#,###.##"); //Format for total
	    System.out.println("\nTotal: "+fmt.format(calctotal(Q1, D1, N1,
	            P1))); //Output total dollar amount in specific decimal format

	    }
	public static double calctotal(int Q1, int D1, int N1, int P1) { //Recorded variables used
	    double total; 
	    total=((0.25 * Q1) + (0.1 * D1) + (0.05 * N1) + (0.01 * P1)); //Formula to calculate total dollar amount
	    return (total);

	}}
	
/* Screen Dump

Enter your total coins:

Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8

Total: $1.08

*/



