package chapters.Chapter05;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		//Financial application: loan amortization schedule
		
		// Create a Scanner
		  Scanner input = new Scanner(System.in);
		 
		  // Enter loan amount
		  System.out.print("Loan amount:");
		  double loanAmount = input.nextDouble();
		 
		  // Enter number of years
		  System.out.print("Enter number of years:");
		  int numberOfYears = input.nextInt();
		 
		  // Enter yearly interest rate
		  System.out.print("Annual interest rate:");
		  double annualInterestRate = input.nextDouble();
		 
		  double monthlyInterestRate = annualInterestRate / 1200;
		  // Calculate payment
		  double monthlyPayment = loanAmount
		    * monthlyInterestRate
		    / (1 - 1 / Math
		      .pow(1 + monthlyInterestRate, numberOfYears * 12));
		  double totalPayment = monthlyPayment * numberOfYears * 12;
		 
		  // Display results
		  System.out.println("Monthly payment:" + (int) (monthlyPayment * 100)
		    / 100.0);
		  System.out.println("Total payment:" + (int) (totalPayment * 100)
		    / 100.0);
		 
		  // Printing table header
		 
		  System.out.printf("%-18s%-18s%-18s%-18s\n", "Payment#", "Interest",
		    "Principal", "Balance");
		 
		  double interest, balance = loanAmount, principal;
		 
		  for (int i = 1; i <= numberOfYears * 12; i++) {
		   interest = monthlyInterestRate * balance;
		   principal = monthlyPayment - interest;
		   balance = balance - principal;
		   System.out.printf("%-18d%-18.2f%-18.2f%-18.2f\n", i, interest,
		     principal, balance);
		  }

	}

}
