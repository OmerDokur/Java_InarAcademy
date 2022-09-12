package chapters.Chapter05;

import java.util.Scanner;

public class Cp02 {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(num1 + " + " + num2 + " = ? ");
		int answer = keyboard.nextInt();
		
		while(num1 + num2 != answer) {
			System.out.println("Wrong answer. Try again.");
			System.out.println(num1 + " + " + num2 + " = ? ");
			answer= keyboard.nextInt();
		}
		System.out.println("Correct answer.");
		
		

	}

}
