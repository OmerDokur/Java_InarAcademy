package chapters.Chapter06;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 
		  while (true) {
		   System.out
		     .print("Enter the number of milliseconds (enter 0 to stop):");
		   long number = input.nextLong();
		   if (number == 0)
		    break;
		   System.out.println("Converted time is " + convertMillis(number));
		  }
		 
		  System.out.println("Program stops!!");
		 }
		 
		 public static String convertMillis(long millis) {
		  long totalMilliseconds = millis;
		 
		  // Obtain the total seconds since midnight, Jan 1, 1970
		  long totalSeconds = totalMilliseconds / 1000;
		 
		  // Compute the current second in the minute in the hour
		  long currentSecond = totalSeconds % 60;
		 
		  // Obtain the total minutes
		  long totalMinutes = totalSeconds / 60;
		 
		  // Compute the current minute in the hour
		  long currentMinute = totalMinutes % 60;
		 
		  // Obtain the total hours
		  long totalHours = totalMinutes / 60;
		 
		  return totalHours + ":" + currentMinute + ":" + currentSecond;

	}

}
