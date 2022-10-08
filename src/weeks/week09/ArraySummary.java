package weeks.week09;

import java.util.Arrays;

public class ArraySummary {

	public static void main(String[] args) {
		int[] inarArr = new int[5];
		inarArr[0] = 4;
		inarArr[2] = 7;
		
		yazdir(inarArr);
		
		boolean[] bArr = new boolean[3];
		yazdir(bArr);
		
		char[] cArr = new char [3];
		yazdir(cArr);
		
		String[] kelimeler = new String[5];
		yazdir(kelimeler);
		

	}
	private static void yazdir(int[]inarArr) {
		System.out.println(Arrays.toString(inarArr));
	}
	private static void yazdir(boolean[]inarArr) {
		System.out.println(Arrays.toString(inarArr));
	}
	private static void yazdir(char[]inarArr) {
		System.out.println(Arrays.toString(inarArr));
	}
	private static void yazdir(String[]inarArr) {
		System.out.println(Arrays.toString(inarArr));
	}

}
