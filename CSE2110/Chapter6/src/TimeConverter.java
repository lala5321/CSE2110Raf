/*

Program: TimeConverter.java        Last Date of this Revision: April 11, 2022

Purpose: Create a TimeConverter application that prompts users to pick between converting hours to minutes, minutes to hours,
		 days to hours, and hours to days. Once user selects their choice they then enter the number they want to convert and 
		 it is converted to the decimal places. User is asked if they want to convert more or end the program.
		 
Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/

import java.text.NumberFormat;
import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		

		{
			Scanner input = new Scanner (System.in);
			
			System.out.print("Welcome to Time Converter! Please enter '1' to convert hours to minutes. '2' to convert minutes to hours. "
					+ "'3' to convert days to hours or '4' to convert hours to days: ");
			
			NumberFormat nf = NumberFormat.getInstance();
			
			int choice = input.nextInt(); //Choice recorded of which thing they want to convert
			
		
	        while (choice != -1) //Loop while choice is not -1
	        	
	      {
	        	
			if (choice == 1) //If User picked Choice 1, hours to minutes
			{
				System.out.print("\nPlease enter how many hours you would like to convert to minutes: ");
				int h = input.nextInt(); //User enters hours recorded
				
				double m = (double) h*60; //Formula to calculate hours to minutes to the decimal place
				
				System.out.println("\n" +h +" hours converted to minutes is " +nf.format(m) +" minutes."); //Output message of hours to minutes conversion
			}
			
			
			else if (choice == 2) //If User picked Choice 2, minutes to hours
			
			{
				System.out.print("\nPlease enter how many minutes you would like to convert to hours: ");
				int m2 = input.nextInt(); //User enters minutes recorded
				
				double h2 = (double) m2/60; //Formula to calculate minutes to hours to the decimal place
				
				System.out.println("\n" +m2 +" minutes converted to hours is " + nf.format(h2) +" hours."); //Output message of minutes to hours conversion
			}
			
			
			else if (choice == 3) //If User picked Choice 3, days to hours
			
			{
				System.out.print("\nPlease enter how many days you would like to convert to hours: ");
				int d = input.nextInt(); //User enters days recorded
				
				double h3 = (double) d*24; //Formula to calculate days to hours to the decimal place
				
				System.out.println("\n" +d +" days converted to hours is " +nf.format(h3) +" hours."); //Output message of days to hours conversion
			}
			
			
			else if (choice == 4) //If User picked Choice 4, hours to days
			
			{
				System.out.print("\nPlease enter how many hours you would like to convert to days: ");
				int h4 = input.nextInt(); //User enters hours recorded 
				
				double d1 = (double) h4/24; //Formula to calculate hours to days to the decimal place
				
				System.out.print("\n" +h4 +" hours converted to days is " +nf.format(d1) +" days."); //Output message of hours to days conversion
			}
			
			System.out.println("\n\nTo convert more, enter '1' to convert hours to minutes. '2' to convert minutes to hours. "
					+ "'3' to convert days to hours or '4' to convert hours to days or enter '-1' to end the program: "); //While loop choice to continue converting based on which conversion rate user picks or to end the program by entering '-1'
			
			choice = input.nextInt(); //Choice re recorded at end of while loop
			
	     }
	        System.out.print("\nThank you for using TimeConverter, have a nice day!"); //User entered '-1' and program ended
}}}
		
/* Screen Dump

Welcome to Time Converter! Please enter '1' to convert hours to minutes. '2' to convert minutes to hours. '3' to convert days to hours or '4' to convert hours to days: 4

Please enter how many hours you would like to convert to days: 57

57 hours converted to days is 2.375 days.

To convert more, enter '1' to convert hours to minutes. '2' to convert minutes to hours. '3' to convert days to hours or '4' to convert hours to days or enter '-1' to end the program: 
-1

Thank you for using TimeConverter, have a nice day!

*/




	
	

