package javaprograms;

public class Fibonacci {

	public static void main(String[] args) {
	int f0=0;
	int f1=1;
	
	for(int i=0;i<=10;i++)
	{
		int f3= f0+f1;
		
		f0=f1;
		f1=f3;
		System.out.print(f3);
	}
	

	}

}
