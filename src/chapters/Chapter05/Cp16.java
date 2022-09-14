package chapters.Chapter05;

import java.util.Scanner;

public class Cp16 {

	public static void main(String[] args) {
		//smallest divisor
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = keyboard.nextInt();
		
		int divi = 2;
		while (divi <=n) {
			if (n % divi == 0)
				break;
			divi++;
			if ( divi == n ) {
				System.out.println("This is prime number.");
			}
		}
		System.out.println("The smallest number other than 1 that divides " + n + " is " + divi + " .");
		
		

	}

}
