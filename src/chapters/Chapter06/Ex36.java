package chapters.Chapter06;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of sides:");
		  int n = input.nextInt();
		 
		  System.out.print("Enter the side:");
		  double s = input.nextDouble();
		 
		  System.out.println("The area of the polygon is " + area(n, s));
		 
		 }
		 
		 public static double area(int n, double side) {
		 
		  return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));

	}

}
