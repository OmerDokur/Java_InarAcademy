package chapters.Chapter05;

public class Ex04 {

	public static void main(String[] args) {
		final int END = 10;
		 
		  // printing table header
		  System.out.printf("%-9s%15s\n", "Miles", "Kilometers");
		 
		  for (int i = 1; i <= END; i++) {
		   System.out.printf("%-9d%15.1f\n", i, i * 1.609);
		  }
	
	}

}
