package chapters.Chapter02;
import java.util.Scanner;

public class Cp03 {
	public static void main(String[] args) {
		Scanner omer = new Scanner(System.in);
		System.out.print("Enter 3 numbers to calculate the average: ");
		double number1 = omer.nextDouble();
		double number2 = omer.nextDouble();
		double number3 = omer.nextDouble();
		
		double average= (number1+number2+number3)/3;
		
		System.out.println("Average of 3 entered numbers: " + average);
		
				
		
	}

}
