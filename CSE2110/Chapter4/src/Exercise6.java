/*

Program: Exercise6.java        Last Date of this Revision: April 11, 2022

Purpose: A MathTutor application that randomly generates equations using different operations and prompts users for answers, then displays if they are correct or not.
		 
Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/


import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		 Scanner sc = new Scanner (System.in);
		       int num1 = 1 +(int)(10*Math.random());//random num1
		       int num2 = 1 +(int)(10*Math.random());//random num2
		       int x = 1 + (int)(10*Math.random());//random answer
		       String operator = "";//random operator
		       int answer = 0;
		       String remainder ="";

		       switch(x){

		           case 1,2,3:
		           operator = "+";//operator is addition
		           answer = num1 + num2;//adding num1 and num2
		           break;

		           case 4,5,6:
		           operator = "-";//operator subtraction
		           answer = num1 -num2;//subtracting num1 and num2
		           break;
		       
		               case 7,8:
		               operator = "*";//operator multiplication
		               answer = num1 * num2;//multiplying num1 and num2
		               break;

		               default:
		               operator = "/";//operator division
		               remainder = "as a whole number without a remainder";//answer as a whole number with no remainder

		               
		             
		           }

		           System.out.print("What is " + num1 + operator +  num2 + remainder+"? ");//asking user a question
		           int UserAnswer = sc.nextInt();//recording answer

		           if (UserAnswer == answer){//checking if answer is correct

		               System.out.println("\nCorrect!");
		           }

		           else{//if not the right answer
		               System.out.println("\nSorry, better luck next time!");
		           }        

		}

		}


/* Screen Dump

What is 7+10?17
Correct!


*/
