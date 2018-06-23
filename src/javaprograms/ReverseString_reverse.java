package javaprograms;

public class ReverseString_reverse {

	public static void main(String[] args) {
		String s="SHIVAM";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(" "+ rev);
	}

}
