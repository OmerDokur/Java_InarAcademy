package chapters.Chapter05;

import java.util.Scanner;

public class Cp07 {

	public static void main(String[] args) {
		//sum the entered numbers
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the numbers to sum (0 to exit):");
		int num = keyboard.nextInt();
		
		int total = 0;
		while (num !=0) {
			total += num;
			System.out.println("Enter the numbers to sum (0 to exit):");
			num =keyboard.nextInt();
		}
		System.out.println("Total: " + total);

	}

}
