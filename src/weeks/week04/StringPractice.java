package weeks.week04;

public class StringPractice {

	public static void main(String[] args) {
		length();
		substring();
		equalsIgnorecase();
		contains();
		trim();
		charAt();
		toLowerCase();
		toUpperCase();
	}

	public static void length() {

		String temp = "Kamikaze şart mıdır?";
		int length = temp.length();
		System.out.println(length);

	}

	public static void substring() {
		String temp = "Inar Academy";
		String yeni = temp.substring(3, 9);
		System.out.println(temp);
		System.out.println(yeni);

	}

	public static void equalsIgnorecase() {
		String temp1 = "Omer";
		String temp2 = "oMeR";
		String temp3 = "Omerin bir kusuru vardı.";
		System.out.println("temp1 ve temp2 aynı mı?: " + temp1.equalsIgnoreCase(temp2));
		System.out.println("temp1 ve temp3 aynı mı?: " + temp1.equalsIgnoreCase(temp3));

	}
	public static void contains() {
		String temp1 = "Kolaylar kolaydır.";
		String temp2 = "kolaydır.";
		System.out.println("temp2 temp1 in içinde var mı?: " + temp1.contains(temp2));
		
	}
	public static void trim() {
		String temp1 = "     Kolay gibi duruyor.";
		System.out.println("Yazının orijinal hali: " + temp1);
		System.out.println("Yazının boşluksuz hali: " + temp1.trim());
		
	}
	public static void charAt() {
		String temp1 = "Baştaki her zaman sondadır.";
		System.out.println(temp1.charAt(20));
	}
	public static void toLowerCase() {
		String temp1= "BosTa DurduM.";
		System.out.println("Yazının küçük yazılmış hali: " + temp1.toLowerCase());
	}
	public static void toUpperCase() {
		String temp1 = "bOsTa DurdUm.";
		System.out.println("Yazının büyük yazılmış hali: " + temp1.toUpperCase());
	}
	
	
}
