package chapters.Chapter02;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		//(Financial application: calculate interest)
		//If you know the balance and the annual percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
		//interest = balance * (annualInterestRate/1200) 
		//Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter balance and interest rate: ");
		  double balance = input.nextDouble();
		  double annualInterestRate = input.nextDouble();
		  double interest = balance * (annualInterestRate/1200);
		  System.out.print("The interest is " + interest);
		 

	}

}
