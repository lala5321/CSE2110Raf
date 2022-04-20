/*

Program: OddSum.java        Last Date of this Revision: March 29, 2022

Purpose: Create a OddSum application that determines the sum of all the odd numbers of an integer provided by user.

Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) 
		
		{
			 Scanner input = new Scanner (System.in);

			    int num = 1;
			    int numSum = 0;

			        System.out.print("Enter a number:  ");//ask for any number

			    int numberMax = input.nextInt();//record number


			    while(num <= numberMax)
			         {
			            System.out.println("The number you have entered is: "   + num);//output it to the screen num


			             numSum = numSum + num;//numSum being added to the num


			             num = num +2; //2 more being added to num
			         }

			               System.out.println("The sum of the equation will be:  " + numSum);//output it to the screen numSum


			       }

			}



			/* Screen Dump

			Enter a number:  12
			The number you have entered is: 1
			The number you have entered is: 3
			The number you have entered is: 5
			The number you have entered is: 7
			The number you have entered is: 9
			The number you have entered is: 11
			The sum of the equation will be:  36

			*/


