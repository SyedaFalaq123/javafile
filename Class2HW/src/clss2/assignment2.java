package clss2;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		
	//1.	Ask the USER for a string (it should print “Please enter a String:”) Scanner
		//a.	assume the user enters “hello”
	//2.	Convert that string to all uppercase and print it (it should print “HELLO”)
	//3.	Print the length of that string (it should print 5)
	//4.	Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
	//5.	Give the last char of the string (it should print “Z”)
	//6.	Concatenate the string from step 1 with string "Test" (it should print “hello Test”)
		
		System.out.println("Please enter accountNo:");
		Scanner userInput= new Scanner(System.in);
		String accountNo = userInput.next();
		String firstStr = accountNo;
		System.out.println(firstStr.toUpperCase());
		
		int firstCommaLoc = firstStr.indexOf(firstStr.toUpperCase());
		
		System.out.println(firstStr.toUpperCase().length());
		
		System.out.println(firstStr.toUpperCase().replace("O","Z"));
		
		String SecStr = "HellZ";
		System.out.println(SecStr.charAt(4));

		System.out.println(firstStr + " " + "Test");
	



	}

}


