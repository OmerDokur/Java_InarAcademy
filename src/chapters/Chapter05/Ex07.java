package chapters.Chapter05;

public class Ex07 {

	public static void main(String[] args) {
		int feePerYear = 10000;
		  int totalFee = 0;
		 
		  for (int i = 1; i <= 14; i++) {
		   feePerYear += feePerYear * .05;
		   // at year ten
		   if (i == 10) {
		    System.out.println("The tuition fee in ten year is $"
		      + feePerYear);
		   }
		   // sumation of fee over the next 4 years
		   if (i > 10) {
		    totalFee = totalFee + feePerYear;
		   }
		  }
		 
		  System.out
		    .println("The total cost of 4 years tuition after the tenth year is $"
		      + totalFee);

	}

}
