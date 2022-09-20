package chapters.Chapter05;

public class Cp18 {

	public static void main(String[] args) {
		
		int sum = 0; 
		for (int i = 0; i < 4; i++) {
		  if (i % 3 == 0) continue;
		  sum += i;
		  
		  System.out.println(sum);
	}
		

	}

}
