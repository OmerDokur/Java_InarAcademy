package chapters.Chapter05;

import java.util.Scanner;

public class Cp04 {

	public static void main(String[] args) {
		//number prediction at once with loop
		
				int number = (int) (Math.random()*101);
				
				Scanner keyboard = new Scanner(System.in);
				System.out.print("Enter a number between 0-100: ");
				int prediction = keyboard.nextInt();
				
				
				while (prediction != number) {
					if (prediction > number) {
						System.out.println("Your number is higher.");
				} else {
					System.out.println("Your number is lower.");
				} 
					System.out.print("Enter a number between 0-100: ");
					prediction = keyboard.nextInt();
	}
				System.out.println("Correct.");

	}
}
