package chapters.Chapter03;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter weight and price for package 1:");
		  double w1 = input.nextDouble();
		  double p1 = input.nextDouble();
		  System.out.print("Enter weight and price for package 2:");
		  double w2 = input.nextDouble();
		  double p2 = input.nextDouble();
		  double r = w2 / p2 - w1 / p1;
		  String s = "";
		 
		  if (r < 0.0000001) { // comparing double to zero is not reliable, using
		        // minimum threshold instead
		   System.out.println("Two packages have the same price.");
		   System.exit(0);
		  }
		 
		  if (r > 0) {
		   s = "Pakage 2";
		  } else {
		   s = "Pakage 1";
		  }
		 
		  System.out.println(s + " has better price.");

	}

}
