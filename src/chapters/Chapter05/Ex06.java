package chapters.Chapter05;

public class Ex06 {

	public static void main(String[] args) {
		final int END = 10;
		  final int MILES_START = 20;
		 
		  // printing table header
		  System.out.printf("%-9s%15s", "Miles", "Kilometers");
		  System.out.print("\t|\t");
		  System.out.printf("%-9s%15s\n", "Kilometers", "Miles");
		 
		  for (int j = 0, i = 1; i <= END; i++, j += 5) {
		   System.out.printf("%-9d%15.3f", i, i * 1.609);
		   System.out.print("\t|\t");
		   System.out.printf("%-9d%15.3f\n", MILES_START + j,
		     (MILES_START + j) / 1.609);
	}

}
}
