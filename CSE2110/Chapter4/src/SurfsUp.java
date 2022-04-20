/*

Program: SurfsUp.java        Last Date of this Revision: April 11, 2022

Purpose: Prompt user for a waveheight and output to user different activities based on waveheight.
		 
Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/

import java.util.Scanner;

public class SurfsUp {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a wave height (feet): "); //ask waveheight

		int waveheight = input.nextInt(); //record waveheight


		if (waveheight > 6) //checks waveheight greater than 6
		{
		System.out.println("Great day for surfing!");
		}


		else if (waveheight < 6) //checks waveheight less than 6
		{
		System.out.println("Go body boarding!");
		}


		else if (waveheight > 3 &&  waveheight < 6) //checks waveheight greater than three and less than 6
		{
		System.out.println("Go for a swim.");
		}

		else if (waveheight > 0 && waveheight < 3 ) //checks waveheight greater than zero but less than 3
		{
		System.out.println("Whoa! What kind of surf is that?");
		}

		}

		}

/* Screen Dump

Enter a wave height (feet): 4
Go body boarding!


*/