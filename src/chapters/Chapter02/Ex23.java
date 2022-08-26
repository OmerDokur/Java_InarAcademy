package chapters.Chapter02;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		//(Cost of driving)
		//Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon,
		//and the price per gallon, and displays the cost of the trip. 
		
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the driving distance:");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon:");
		double fuelEff = input.nextDouble();
		System.out.print("Enter price per gallon:");
		double pricePerGallon = input.nextDouble();
		double cost = distance / 25.5 * pricePerGallon;
		System.out.print("The cost of driving is $" + cost);

	}

}
