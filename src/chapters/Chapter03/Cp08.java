package chapters.Chapter03;

import java.util.Scanner;

public class Cp08 {

	public static void main(String[] args) {
		
		int number = 6;
		boolean even;
		
		if (number%2 == 0)
			even = true;
		else
			even = false;
		
		even = number %2 == 0;
		System.out.println(even);

	}

}
