package chapters.Chapter07;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of values:");
		   
		  int[] values = new int[input.nextInt()];
		   
		  System.out.print("Enter the number of values:");
		   
		  for (int  i= 0; i < values.length; i++) {
		   values[i]= input.nextInt();
		  }
		   
		  if(isConsecutiveFour(values) ) {
		   System.out.println("The list has consecutive fours");
		  }else {
		   System.out.println("The list has no consecutive fours");
		  }
		    
		   
		   
		   
		 }
		 
		 public static boolean isConsecutiveFour(int[] values) {
		 
		  int start = values[0];
		  int count = 1;
		  for (int i = 1; i < values.length; i++) {
		   if (start != values[i]) {
		    start = values[i];
		    count = 1;
		   } else {
		 
		    count++;
		   }
		    
		   if(count == 4) break;
		 
		  }
		 
		  if (count == 4)
		   return true;
		 
		  return false;

	}

}
