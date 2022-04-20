/*

Program: AccountSetup.java        Last Date of this Revision: March 29, 2022

Purpose: Create a AccountSetup application that prompts users for a range of numbers where they have to guess the random computer generated number till they get it right.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/
import java.util.Scanner;

public class AccountSetup {

	public static void main(String[] args)    {
	     System.out.print("Enter a user name: ");//ask for user name

	      Scanner input = new Scanner (System.in);

	      String username = input.next();

	      username = username.toLowerCase();//user name and password going to turn into lower case

	      String userInput = "r";


	         while (!(userInput.equalsIgnoreCase("c")))
	          {

	        	 System.out.print("\nEnter a password that is at least 8 characters: ");//ask for password with at least 8 characters
	             
	             String password = input.next();

	                password = password.toLowerCase(); //Lower case converter
	                   
	                int character = password.length(); //Character length finder
	                   
	                   
	          if (character < 8)
	           {
	            System.out.println("\nToo short.");//displays when password is less than 8 characters
	             continue;
	           }
	         
	         
	            System.out.print("\nPress 'C' to see your username and password or press 'R' to rewrite your password: "); //While Loop to see user name and password or rewrite password
	            userInput = input.next();
	           
	            if(userInput.equalsIgnoreCase("c"))
	            {
	             System.out.println("\nYour username is " + username + " and your password is " +password);//displays user name and password in lower case
	           
	            }
	           
	             

	         }

	  }

	}

/* Screen Dump

Enter a user name: MattD

Enter a password that is at least 8 characters: Programmer7

Press 'C' to see your username and password or press 'R' to rewrite your password: c

Your username is mattd and your password is programmer7

*/


