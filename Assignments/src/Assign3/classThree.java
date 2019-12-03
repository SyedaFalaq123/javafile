/*
1.	Given N --- Print this pattern up to N: 1, 4, 8, 12, 16…
2.	Given N --- Print backward to 0. 
	a.	(Ask user for a number and lets assume N is 5 so if the user input 5 
			– then the program should print: 5 4 3 2 1 0)
3.	Build a basic calculator (Plus, Minus, Multiplication, Division)
	a.	(Ask user for a number and then ask for the second number 
			– then ask for the operation: ADD, SUB, MULTI, DIV)
	b.	Use “IF and ELSE” or “SWITCH”
	c.	Use method for each operation
4.	Ask the USER for a string and print if the string is palindrome
5.	Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.


*/
package Assign3;

import java.util.Scanner;

public class classThree {

	

	//main method
	public static void main(String[] args) 
	
	
	{
		
	
	//making each action into different methods rather than writing all the codes into the main method
		//just incase the formula is changed
		
		Scanner userIn = new Scanner(System.in);
		int n = userIn.nextInt();
		
		
//Question 1:Print this pattern up to N: 1, 4, 8, 12, 16..
		
	
		if (n>0) {
			System.out.print(1);
			
		}
		
		//incrementing by 4
		for (int i=4; i<=n; i=i+4) {
		
		System.out.print("," +i+" ");
		System.out.print("");
		
		}
		System.out.println();
		System.out.println();
		
System.out.println("=============================================");
//Question 2:	print Backwards (decrementing by 4)	
		//Ask user for a number and lets assume N is 5 so if the user input 5 
		//– then the program should print: 5 4 3 2 1 0)
		for  (int i=5; i>=0; i--) {
				
		System.out.print(i+",");
	
				}
		System.out.println();
		
		
System.out.println("=============================================");
		
//======================End of Question 1 & 2 IN Main Method===========================================				
		
//Question 3:
		System.out.println();
		
		System.out.println("This is a Basic Calculator");
		System.out.println("Enter your first Number");
				int first = userIn.nextInt();
				
		System.out.println("Enter your second Number");
				int second = userIn.nextInt();
	
		System.out.println("Enter your Operation (ADD,SUB,MULTI,DIV)");
		String opt = userIn.next();
			
			if(opt.contentEquals("+")) {
				add(first, second);
			}
			else if (opt.contentEquals("-")) {
				sub(first, second);
			}
			else if (opt.contentEquals("*")) {
				multi(first, second);
			}
			else if (opt.contentEquals("/")) {
				div(first, second);
			}
			
			else {
				System.out.println("Your input did not match any one of the followings: +,-,*,/");
			}
			
//======================End of Question 3 IN Main Method===========================================		
			System.out.println();
			System.out.println("=============================================");
			
			
//Question 4
		
			System.out.println("Enter palindromic words:");
			//level, kayak, or madam
			
			String UserData=userIn.next();
			 
			UserData=UserData.toLowerCase();
			
			char[] charArray_UD = UserData.toCharArray();
			
			int UDL =UserData.length();
			
			//reverse methods applied below:
			String Reverse="";
			
			for(int i=UDL-1; i>=0; i--) {
				Reverse = Reverse + charArray_UD[i];
				//level =empty + o
				
			}
			System.out.println(Reverse);
			if(UserData.equals(Reverse)) {
				System.out.println("Palidrome");
			}
			else {
				System.out.println("No Palidrome");
	
			}
			
			evenOdd(29);
	}
//======================End of Question 4 IN Main Method===========================================		

//======================Question 3 & 5 OUTSIDE of Main Method===========================================			
	//Question 3=Build a basic calculator
//Question 5 = print out ODD if the number is odd; otherwise print EVEN
		
	
public static void evenOdd(int i) {
		int Number= i;
		if (Number % 2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
	}


	
	public static void add(int number1, int number2) {
		System.out.println(number1+number2);
	}
	public static void sub(int number1, int number2) {
		System.out.println(number1-number2);
		
	}
	public static void multi(int number1, int number2) {
		System.out.println(number1*number2);
	}
	public static void div(int number1, int number2) {
		System.out.println(number1/number2);
	}
	
	}
		
	
		
	