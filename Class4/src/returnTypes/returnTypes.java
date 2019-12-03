package returnTypes;

public class returnTypes {
	
	public static void main(String[] args) {
	/*why we need a method becasue its easy to maintain. 
	 *  the requirements change
	 */
	/*
		int a;
		int b;
		
		//these are called variables
		//then you can declare them for example
		
				a = 10
				b = 20 
		you can write them in 4 lines or in one 1
		int a=10;
		int b=20;
				here the values are initionizing all at once
			
		->	System.out.println(a+b);
				
	Asking values from user?
	
	
				
		main method is urs so u need to make an outside method where other ppl can access it
		
		
		
		*/
		
		/*
		addTwo(); 
		
		the main method is gonna read the called 'addTwo', then main method will go outide the main method to find value named 'addTwo'
		since addTwo does not take anything in the parathesis () then the main method will not take anything 
		Unless there is something written in the doorwar ()
		
		*/
addTwo(8,55);
		//System.out.println("The result is:"+ addTwo(8,55)); this functiona will not work becaue it will not remember
	}

	//OUTIDE Main Method
	public static int addTwo (int whatever1, int whatever2) {
		
		
//-> public static STRING = will print everything even the int but when it will return to the main method it will not 
		//print 63 but Hello.=>return "Hello";
		//-> int whatever1, int whatever2 is only used in this method
			//-> instead of writting 5+6
		
		int theResult = whatever1 + whatever1;
		
		system.out.println(theResult);
		
		return theResult;
		//anything can be returned parameted and non paramented
		
			/* 
			int theResult = 5+6; //this is to hold the method into the memory
			System.out.println(theResult);
			System.out.println(theResult +100);
		
	}
	
	 * addTwo is just a name  
	 * () this parathesis is a doorway to accept something from whoever is gonna use or call "addTwo" method
	 * its a doorway to pass u something
	 * {} the method is inserted
	 * whatever is gonna b in this method its gonna always call this method and the system is gonna move forward
	 * 
	 */
}}
