package chapters.Chapter02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//(Health application: computing BMI)
		//Body Mass Index (BMI) is a measure of health on weight. 
		//It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
		//Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
		//Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter weight in pounds:");
		  double weight = input.nextDouble();
		  System.out.print("Enter height in inches:");
		  double height = input.nextDouble();
		  double BMI = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);
		 
		  System.out.print("BMI is " + BMI);
		
	}

}
