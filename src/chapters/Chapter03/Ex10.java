package chapters.Chapter03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int number1= (int) (Math.random()*90+10);
		int number2= (int) (Math.random()*90+10);
		
		System.out.println("Whats is " + number1+"+" + number2);
		
		System.out.println("Your answer: ");
		
		int answer = input.nextInt();
		
		if ( answer == number1 + number2 ) {
			System.out.println("Correct answer.");
		} else {
			System.out.println("Wrong answer.");
		}
		
	}

}
