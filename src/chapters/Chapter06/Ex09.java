package chapters.Chapter06;

public class Ex09 {

	public static void main(String[] args) {
		System.out.printf("%-15s%-15s|    %-15s%-15s\n","Feet","Meters","Meters","Feet");
		  System.out.println( String.format("%62s"," ").replace(' ', '-') );
		   
		  for (int m = 20, f = 1  ; f <=10; f++, m+=5) {
		    
		   System.out.printf("%-15.1f%-15.3f|    %-15.1f%-15.3f\n",(float)f, footToMeter(f),(float)m,meterToFoot(m));
		    
		  }
		   
		 
		 }
		  
		 /** Convert from meter to foot */
		 public static double meterToFoot(double meter) {
		  return 3.279 * meter;
		 }
		  
		 /** Convert from foot to meter */
		 public static double footToMeter(double foot) {
		  return  0.305 * foot;

	}

}
