package chapters.Chapter05;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		//Financial application: compute CD value
		Scanner input = new Scanner(System.in);
		  // Enter saving amount
		  System.out.print("Enter the initial deposit amount:");
		  double saving = input.nextDouble();
		 
		  System.out.print("Enter annual percentage yield:");
		  double interest = input.nextDouble();
		  interest /= 12 * 100; // convert interest rate from annual to monthly
		 
		  System.out.print("Enter maturity period (number of months):");
		  double noOfMonths = input.nextDouble();
		 
		  // print header
		  System.out.printf("%7s%12s\n", "Month", "CD value");
		 
		  for (int i = 1; i <= noOfMonths; i++) {
		 
		   saving = saving * (1 + interest);
		   System.out.printf("%4d%12.2f\n", i, saving);

	}

}
}
