package chapters.Chapter02;

import java.util.Scanner;

public class Cp14 {

	public static void main(String[] args) {
		//SalesTax
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is " + (int)(tax*100)/100.0);

	}

}
