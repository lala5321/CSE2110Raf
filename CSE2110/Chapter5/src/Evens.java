/*

Program: Evens.java        Last Date of this Revision: March 29, 2022

Purpose: Create a Even Number application that illustrates the even numbers 1 through 20.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/
public class Evens {

	public static void main(String[] args) {
		
		int n = 20; //Max range 20
		
		System.out.print("Even Numbers from 1 to "+n+" are: "); //Display message
		
		for (int i = 1; i <= n; i++) { //Minimum range 1
			
			
		   if (i % 2 == 0) { // number%2 == 0 represents formula for even number
			   
			System.out.print(i + " "); //Final display message

	}

}
		
	}
}

/* Screen Dump

Even Numbers from 1 to 20 are: 2 4 6 8 10 12 14 16 18 20 


*/
