package chapters.Chapter05;

public class Ex20 {

	public static void main(String[] args) {
		//Display prime numbers between 2 and 1,000
		final int UPPER_BOUND = 1000; // Upper bound
	    final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
	    int count = 0; // Count the number of prime numbers
	    int number = 2; // A number to be tested for primeness
	 
	    System.out.println("The prime numbers in from 2 to 1000 are");
	 
	    // Repeatedly find prime numbers
	    while (number <= UPPER_BOUND) {
	      // Assume the number is prime
	      boolean isPrime = true; // Is the current number prime?
	 
	      // Test if number is prime
	      for (int divisor = 2; divisor <= number / 2; divisor++) {
	        if (number % divisor == 0) { // If true, number is not prime
	          isPrime = false; // Set isPrime to false          
	          break; // Exit the for loop
	        }
	      }
	 
	      // Print the prime number and increase the count
	      if (isPrime) {
	        count++; // Increase the count
	 
	        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
	          // Print the number and advance to the new line
	          System.out.println(number);
	        }
	        else
	          System.out.print(number + " ");
	      }
	 
	      // Check if the next number is prime
	      number++;

	}

}
}

