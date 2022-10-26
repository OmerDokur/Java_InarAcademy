package chapters.Chapter07;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.print("Enter ten numbers:");
		  Scanner input = new Scanner(System.in);
		  double[] numbers = new double[10];
		 
		  for (int i = 0; i < numbers.length; i++) {
		   numbers[i] = input.nextDouble();
		  }
		 
		  System.out.println("The index of minimum number is: " + indexOfSmallestElement(numbers));
		 }
		 
		 public static int indexOfSmallestElement(double[] array) {
		 
		  double min = array[0];
		  int minIndex=0;
		 
		  for (int i = 1; i < array.length; i++) {
		   if (min > array[i]) {
		    minIndex = i;
		   }
		  }
		 
		  return minIndex;

	}

}
