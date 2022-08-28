package chapters.Chapter03;

import java.util.Scanner;

public class Cp07 {

	public static void main(String[] args) {
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		System.out.println(x==0.5);
		
		final double EPSILON = 1E-14;
		x= 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		if (Math.abs(x-0.5) < EPSILON)
			System.out.println(x + " is approximately 0.5");

	}

}
