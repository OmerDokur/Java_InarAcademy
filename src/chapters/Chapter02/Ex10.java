package chapters.Chapter02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//(Science: calculating energy)
		//) Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. 
		//Your program should prompt the user to enter the amount of water in kilograms and the initial
		//and final temperatures of the water. The formula to compute the energy is
		//Q = M * (finalTemperature – initialTemperature) * 4184
		//where M is the weight of water in kilograms, temperatures are in degrees Celsius,
		//and energy Q is measured in joules.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the amount of water in kilograms:");
		  double M = input.nextDouble();
		  System.out.print("Enter the initial temperature:");
		  double initialTemperature = input.nextDouble();
		  System.out.print("Enter the final temperature:");
		  double finalTemperature = input.nextDouble();
		 
		  double Q = M * (finalTemperature - initialTemperature) * 4184;
		  System.out.print("The energy needed is " + Q);
		 

	}

}
