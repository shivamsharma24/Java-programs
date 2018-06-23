package javaprograms;

public class PalindromeinNumber {
	static int n=121;
	static int rev=0;
	
	public static void main(String[] args) {
		
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if (n==rev)
		{
			System.out.println("Palndrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
