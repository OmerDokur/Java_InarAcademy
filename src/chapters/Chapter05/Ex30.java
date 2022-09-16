package chapters.Chapter05;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		//Financial application: compound value
		
		Scanner input = new Scanner(System.in);
		  // Enter saving amount
		  System.out.print("Enter monthly saving:");
		  double saving = input.nextDouble();
		 
		  System.out.print("Enter annual interest rate:");
		  double interest = input.nextDouble();
		  interest /= 12 * 100; // convert interest rate from annual to monthly
		 
		  System.out.print("Enter number of months:");
		  double noOfMonths = input.nextDouble();
		  double TotalSaving = 0;
		 
		  for (int i = 1; i <= noOfMonths; i++) {
		 
		   TotalSaving = (TotalSaving + saving) * (1 + interest);
		 
		  }
		 
		  System.out.println("Total saving is " + TotalSaving);

	}

}
