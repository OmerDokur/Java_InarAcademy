package chapters.Chapter05;

import java.util.Scanner;

public class Cp05 {

	public static void main(String[] args) {
		// çoklu çıkartma

		Scanner keyboard = new Scanner(System.in);
		
		String report = "";
        int count = 0;
        int correctCount = 0;
		while (count<5) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			if (num1 < num2) {
				int tempnum = num1;
				num1 = num2;
				num2 = tempnum;

			}
			System.out.println(num1 + " - " + num2 + " =? ");
			int answer = keyboard.nextInt();

			if (num1 - num2 == answer) {
				System.out.println("Correct.");
				correctCount++;
				report += num1 + " - " + num2 + " =	" + answer + " true\n";
				} else {
				System.out.println("Wrong.");
				report += num1 + " - " + num2 + " =	" + answer + " false\n";
			}
			count++;
		}
		System.out.println(count + " questions was asked.");
		System.out.println(correctCount + " correct answer.");
		System.out.println(report);
		
	}
}
