package chapters.Chapter06;

public class Ex29 {

	public static void main(String[] args) {
		 for (int i = 2; i < 1000; i++) {
			 
			 
			   if (isPrime(i)&&isPrime(i+2)) {
			    System.out.printf("(%d, %d)\n", i, i+2);
			   }
			  }
			   
			 }
			  
			  
			 /** Check whether number is prime */
			 public static boolean isPrime(int number) {
			  for (int divisor = 2; divisor <= number / 2; divisor++) {
			   if (number % divisor == 0) { // If true, number is not prime
			    return false; // number is not a prime
			   }
			  }
			 
			  return true; // number is prime
	}

}
