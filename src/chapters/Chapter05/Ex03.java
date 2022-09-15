package chapters.Chapter05;

public class Ex03 {

	public static void main(String[] args) {
		final int END = 199;
		   
		  //printing table header
		  System.out.printf("%9s%15s\n","Kilograms","Pounds");
		   
		  for(int i=1; i<=END;i++ ){
		   System.out.printf("%-9d%15.1f\n",i,i*2.2);

	}
	}

}
