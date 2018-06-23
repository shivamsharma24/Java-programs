package javaprograms;

public class VerifyPrimeNumber {
	boolean status = false;// Assuming given number is prime.

	public void primenumber(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) { // Checking if the number is divisible completely and given zero remainder
				status = true;
				break;
			} else {
				status = false;
			}
		}
		if (status == false) {
			System.out.println("Given number is prime number");
		} else {
			System.out.println("given number is not prime");
		}
	}

	public static void main(String[] args) {
		VerifyPrimeNumber obj = new VerifyPrimeNumber();
		obj.primenumber(11);
	}
}
