package chapters.Chapter05;

import java.util.Scanner;

public class Cp03 {

	public static void main(String[] args) {
		//number prediction at once
		
		int number = (int) (Math.random()*101);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number between 0-100: ");
		int prediction = keyboard.nextInt();
		
		System.out.println("Our number: " + number);
		
		if (prediction == number) {
			System.out.println("Correct.");
		} else if (prediction > number) {
			System.out.println("Your number is higher.");
		}else {
			System.out.println("Your number is lower.");
		}

	}

}
