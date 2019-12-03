

package myMethod;

import myJava.methodQuiz;

abstract class myClass {
	public static void main(String[] args) {
		
		myClass.printSomething();
		printparameter("Hola");
		isRight(2,2);
		System.out.println(isRight(2,2));
		greatEr(true);
		myClass obj = new myClass();
		System.out.println(obj.reverse("World"));
		
		///1.Create a default access modifier method that will print "Hello"

		public static void printSomething() {
			System.out.println("Hello"); 
		}
		//2.Create a public access modifier method that will take-in String parameter and concatenate it with "Hello" and print it out.


		public static void printparameter (String x) {
			System.out.println(x + "Hello");
		}
		
//		3.Create a public static method to take in two int parameter and if the sum if two int is greater than 10, then return true
		
		public static boolean isRight(int a, int b) {
			int sum = a +b;
			if (sum > 10)
				{return true;}
			else {return false;}
		
			//4.creat a protected static method to take in a Boolean parameter and return 0 if false, otherwise return 1.	
		protected static int greatEr (boolean c) {
			int sum = a + b;
			if (sum > 10) {
				return true;}
			else {
				return false;}
		}
			
				//5.Create a public parameter and return the reverse of the string.
				public String reverse(String f) {
					StringBuilder ab = new StringBuilder
							String aReverse = ab.append(f).reverse().toString();
					return aReverse;
				}
				
			}
		}
	}
		
	
