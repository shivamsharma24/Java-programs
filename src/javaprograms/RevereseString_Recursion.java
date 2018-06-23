package javaprograms;
// Recusrion is a process in which function calls itself direclty or indirectly.
// Solution of  base case is provided.
// And the bigger problem is expressed in terms of smaller problem

public class RevereseString_Recursion {
	
	static String rev="";
	public static String reversestring(String str)
	{
		if(str.length()==1) {
			return str;
		}
		else
			rev= rev+str.charAt(str.length()-1)+reversestring(str.substring(0, str.length()-1));
		return rev;
		
	}

	public static void main(String[] args) {
		RevereseString_Recursion obj = new RevereseString_Recursion();
		System.out.println(obj.reversestring("shivam"));
	}

}
