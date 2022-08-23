package chapters.Chapter02;

import java.util.Scanner;

public class Ex01 {
	

	public static void main(String[] args) {
		//(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. 
		//The formula for the conversion is as follows:
		//fahrenheit = (9 / 5) * celsius + 32
		//Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");

	}

}
