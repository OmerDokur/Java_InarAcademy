package weeks.week04;

public class ciftKarakterler {

	public static void main(String[] args) {
		sadeceUnluHarfler("Yaramazlık yapma kucuk insan.");
		
		isPalindrome("Alala");

	}

	public static void sadeceUnluHarfler(String s) {
		// omer => oe
		// vedat => ea

		int l = s.length();

		for (int i = 0; i < l; i++) {
			char harf = s.charAt(i);

			if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
				System.out.print(harf);
			}
		}
	}

	public static void sadeceUnsuzHarfler(String s) {
		int l = s.length();
		String result = "";

		for (int i = 0; i < l; i++) {
			char harf = s.charAt(i);

			if (!(harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u')) {
				result = result + s.charAt(i);
			}
		}
		System.out.println(result);
	}

	private static void isPalindrome(String s) {
        boolean isPalindrome = true;
        // civic
        int l = s.length();
        for (int i = 0; i < 1 / 2; i++) {
            if (s.charAt(i) != s.charAt(l - 1 - i)) {
                isPalindrome = false;

            }
        }
        if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome");
        }
	}
	}

