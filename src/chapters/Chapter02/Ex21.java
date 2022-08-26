package chapters.Chapter02;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		//(Financial application: calculate future investment value)
		//Write a program that reads in investment amount, annual interest rate, and number of years, and displays the future investment value using the following formula:
		//futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12 
		//For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
		
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter investment amount:");
		  double investmentAmount = input.nextDouble();
		  System.out.print("Enter annual interest rate in percentage:");
		  double monthlyInterestRate = input.nextDouble();
		  monthlyInterestRate = monthlyInterestRate / 12;
		  System.out.print("Enter number of years:");
		  double numberOfYears = input.nextDouble();
		  double futureInvestmentValue = investmentAmount
		    * Math.pow((1 + monthlyInterestRate / 100),
		      (numberOfYears * 12));
		  System.out.print("Accumulated value is " + futureInvestmentValue);

	}

}
