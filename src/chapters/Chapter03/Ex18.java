package chapters.Chapter03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the weight of the package in pound:");
		  double w = input.nextDouble();
		  double cost = 0;
		 
		  if (w > 0 && w <= 1) {
		   cost = 3.5;
		  } else if (w > 1 && w <= 3) {
		   cost = 5.5;
		  } else if (w > 3 && w <= 10) {
		   cost = 8.5;
		  } else if (w > 10 && w <= 20) {
		   cost = 10.5;
		  }
		 
		  if (cost == 0) {
		   System.out.print("the package cannot be shipped.");
		   System.exit(0);
		  }
		 
		  System.out.print("The cost of shipping is " + cost);
		 
		 }

	}


