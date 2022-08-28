package chapters.Chapter03;

import java.util.Scanner;

public class Cp02 {

	public static void main(String[] args) {
		int number1= (int)(System.currentTimeMillis()%10);
		int number2= (int)(System.currentTimeMillis() /6 %10);
		
		System.out.println(number1 + " + " + number2 + " = ? ");

		Scanner keyboard = new Scanner(System.in);

		int total = keyboard.nextInt();

		if (number1 + number2 == total) {
			System.out.println("Correct Answer");

		} else {
			System.out.println("Wrong Answer ");
		}

	}

}
