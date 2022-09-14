package chapters.Chapter05;

import java.util.Scanner;

public class Cp11 {

	public static void main(String[] args) {
		//OBEB
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = keyboard.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = keyboard.nextInt();
		
		int obeb =1;
		int divi =2;
		
		while (divi <= num1 && divi <=num2) {
			if (num1 % divi == 0 && num2 % divi == 0) {
				obeb = divi;
			}
			divi++;
		}
		System.out.println(num1 + " ve " + num2 + " sayilarinin obebi: " + obeb + " dir.");

	}

}
