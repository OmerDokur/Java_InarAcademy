package chapters.Chapter02;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
	//(Convert pounds into kilograms)
	//Write a program that converts pounds into kilograms. 
	//The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. 
	//One pound is 0.454 kilograms.
	
	 Scanner input = new Scanner(System.in);
     System.out.print("Enter a number in pounds: ");

     double pounds = input.nextDouble();
     double kilograms = pounds * 0.454;

     System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	
	}
}
