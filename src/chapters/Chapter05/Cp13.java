package chapters.Chapter05;

import java.util.Scanner;

public class Cp13 {

	public static void main(String[] args) {
		// Decimal to Hexadecimal

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a one number: ");
		
		int integer = keyboard.nextInt();
		String hexNum = "";
		
		int remain = integer;
		while (remain >0 ) {
			int digit = remain % 16;
			
			if (digit < 10) {
				hexNum = digit +hexNum;
			} else {
				hexNum = (char) ('A' + (digit - 10)) + hexNum;
		}
			remain /= 16;
		
		}
		
		System.out.println(integer + " Converted to Hex= " +hexNum);

	}

}
