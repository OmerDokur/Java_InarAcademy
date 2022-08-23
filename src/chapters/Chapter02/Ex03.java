package chapters.Chapter02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//(Convert feet into meters)
		//Write a program that reads a number in feet, converts itto meters, and displays the result. One foot is 0.305 meter.
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter a value for feet: ");
	        double feet = input.nextDouble();
	        double meters = feet * 0.305;
	        System.out.println(feet + " feet is " + meters + " meters.");
		
		
	}

}
