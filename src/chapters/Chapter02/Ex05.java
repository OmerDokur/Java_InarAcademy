package chapters.Chapter02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		//(Financial application: calculate tips)
		//Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. 
		//For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
		
		 double gratuityRate,
         gratuityTotal,
         total,
         subtotal;
		 
		 Scanner input = new Scanner(System.in);

		 System.out.print("Please enter the subtotal and gratuity rate: ");
		 subtotal = input.nextDouble();
		 gratuityRate = input.nextDouble();

		 gratuityTotal = subtotal * gratuityRate * .01;
		 total = subtotal + gratuityTotal;

		 System.out.print("The gratuity is $" + gratuityTotal + " and total is $" + total);
 
	}


}
