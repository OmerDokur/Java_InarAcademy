package chapters.Chapter05;

public class Ex27 {

	public static void main(String[] args) {
		//Display leap years
		
		 int noOfLeapYear = 0;
		 
		  for (int year = 101; year <= 2100; year++) {
		   boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
		     || (year % 400 == 0);
		 
		   if (isLeapYear) {
		    noOfLeapYear++;
		    System.out.print(year + " ");
		    if (noOfLeapYear % 10 == 0) {
		     System.out.println();
		    }
		   }
		  }
		 
		  System.out.println("\nThe number of leap year between 100 and 2100 is "
		    + noOfLeapYear);

	}

}
