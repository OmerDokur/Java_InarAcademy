package chapters.Chapter05;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		//Find the factors of an integer
		
		System.out.println("Enter an integers: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 2;
		String s = "";
		
		while ( n != 1) {
			if (n % i == 0) {
				
				s = s + ", " + i;
				n = n/ i;
				i= 2;
			} else {
				i++;
			}
		}
		System.out.println("The factors are: " + s.substring(2) + ".");

	}

}
