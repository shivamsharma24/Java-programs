package javaprograms;

public class SingletonClass {
	// Singleton Class means you can create only one object.
	// Constructor is made private in order to restrict the object creation.
	// Make static method to get instance of the object to handle the object
	// creation in class only.
	private static SingletonClass obj;// Varible
	static {
		obj = new SingletonClass();// Static block
	}

	private SingletonClass()// Private Constructor
	{

	}

	public static SingletonClass getInstance() {
		return obj;
	}

	public void test() {
		System.out.println("Its working");
	}

	public static void main(String[] args) {
		SingletonClass s = getInstance();

		s.test();

	}

}
