package chapters.Chapter02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		//(Physics: finding runway length)
		// Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway length needed for an airplane to take off using the following formula:
		//length = (v*v)/ (2a)
		//Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second squared (m/s2 ), and displays the minimum runway length.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter speed and acceleration:");
		  double v = input.nextDouble();
		  double a = input.nextDouble();
		  double length = Math.pow(v, 2)/(2*a);
		   
		  System.out.print("The minimum runway length for this airplane is " + length);
		

	}

}
