/*

Program: Exercise1.java        Last Date of this Revision: April 11, 2022

Purpose: Prompt user for a number of copies to be printed and output a different bulk price for larger quantities of copies.
		 
Author: Rafat E
School: CHHS
Course: Computer Science  20
 

*/

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of copies to be printed: ");//ask number of copies

        int copy = input.nextInt();//record number of copies

        if (copy > 0 && copy < 100 )//checks copies greater than 0 and less than 100
        {
            System.out.print("Price per copy is: $0.30");
            System.out.print("\n");
            System.out.println("Total cost is: " + 0.30 * copy);
        }

        else if (copy > 99 && copy < 500)//checks copies greater than 99 and less than 500
        {
            System.out.print("Price per copy is: $0.28");
            System.out.print("\n");
            System.out.println("Total cost is: " + 0.28 * copy);
        }

        else if (copy > 499 && copy < 750)//checks copies greater than 499 and less than 750
        {
            System.out.print("Price per copy is: $0.27");
            System.out.print("\n");
            System.out.println("Total cost is: " + 0.27 * copy);
        }
           

        else if (copy > 749 && copy < 1001)//checks copies greater than 749 and less than 1001
            {
            System.out.print("Price per copy is: $0.26");
            System.out.print("\n");
            System.out.println("Total cost is: " + 0.26 * copy);
            }



        else if (copy > 1000)//checks copies greater than 1000
        {
            System.out.print("Price per copy is: $0.25");
            System.out.print("\n");
            System.out.println("Total cost is: " + 0.25 * copy);
        }

       
    }
}

/* Screen Dump

Enter the number of copies to be printed: 250
Price per copy is: $0.28
Total cost is: 70.0

*/
