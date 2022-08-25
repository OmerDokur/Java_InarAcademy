package chapters.Chapter02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// (Find the number of years)
		//Write a program that prompts the user to enter the minutes (e.g., 1 billion),
		//and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days
		
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of minutes:");
		  int number = input.nextInt();
		  int days = number/(24*60);
		  int years = days/365;
		 
		 
		  System.out.println(number + " minutes is approximately " + years +" years and " + days%365 +" days");

	}

}
