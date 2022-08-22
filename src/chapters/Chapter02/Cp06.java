package chapters.Chapter02;

import java.util.Scanner;

public class Cp06 {
	public static void main(String[] args) {
		System.out.print("Enter an integer in seconds: ");
		
		Scanner keyboard = new Scanner(System.in);
		
		int second = keyboard.nextInt();
		
		int minute = second / 60;
		
		int secondremaining= second % 60;
		
		System.out.println(second + " second = "+ minute + " minute and " + secondremaining + " seconds.");
		
	}

}
