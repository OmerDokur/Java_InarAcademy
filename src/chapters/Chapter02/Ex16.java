package chapters.Chapter02;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		//(Geometry: area of a hexagon)
		//Write a program that prompts the user to enter the side of a hexagon and displays its area. 
		//The formula for computing the area of a hexagon is:
		//Area: ((3(squareroot3)) / 2) * s^2     where s is the length of a side.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the side:");
		  double s = input.nextDouble();
		  double area = (3 * Math.sqrt(3) / 2) * Math.pow(s, 2);
		  System.out.print("The area of the hexagon is " + (double) area);
		

	}

}
