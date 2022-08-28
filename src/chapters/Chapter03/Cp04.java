package chapters.Chapter03;

import java.util.Scanner;

public class Cp04 {

	public static void main(String[] args) {
		// Points of lesson

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your points: (Between 0-100)");

		int lessonPoint = keyboard.nextInt();

		if (lessonPoint >= 90) {
			System.out.println("Your score is A.");
		}else if (lessonPoint >= 80) {
			System.out.println("Your score is B.");
		}else if (lessonPoint >= 70) {
			System.out.println("Your score is C.");
		}else if (lessonPoint >= 60) {
			System.out.println("Your score is D.");
		}else if (lessonPoint >= 50) {
			System.out.println("Your score is F.");
		}
	}

}
