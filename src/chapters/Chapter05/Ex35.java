package chapters.Chapter05;

public class Ex35 {

	public static void main(String[] args) {
		//Summation
		
		double sum = 0 ;
		 
		  for (int i = 1; i <= 624; i++) {
		   sum+=1/(Math.sqrt(i)+Math.sqrt(i+1));
		  }
		  System.out.println("The sum is " + sum);
		   

	}

}
