package myJava;

public class methodQuiz {

	public static void main(String[] args) {
		returnCond(2,2);
		System.out.println(returnCond(2,2));
		trueFalse(true);
		System.out.println(trueFalse(true));
		methodQuiz obj = new methodQuiz();
		System.out.println(obj.reverse("World"));

	}
	
	//1.Create a default access modifier medthod that will print "Hello"
	static void printMethod() {
		System.out.println("Hello");
	}

	//2.Create a public access modifier medthod that will take -in String parameter and concatenate it with "Hello" and print it out.
	public static boolean returnCond(int a, int b) {
		int sum = a +b;
		if (sum > 10)
			return true;
		else return false;
	}
	
	//3.Create a public static method to take in two int parameter and if the sum if two int is greater than 10, then return true
	protected static int trueFalse (boolean c) {
		int sum = a + b;
		if (sum > 10)
			return true;
		else return false;
	}
	//4.creat a protected static method to take in a Boolean parameter and return 0 if false, otherwise return 1.
	//5.Create a public parameter and return the reverse of the string.
	
}
