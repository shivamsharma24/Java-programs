package javaprograms;

public class PalindromeString {
	String rev = "";

	public void palindrome(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		// System.out.println(rev);
		if (rev.equalsIgnoreCase(s)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		PalindromeString obj = new PalindromeString();
		obj.palindrome("MoM");
		obj.palindrome("madam");

	}

}
