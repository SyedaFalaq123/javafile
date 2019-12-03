package learningStrings;

public class DifferentStrings {

	public static void main(String[] args) {
		
//String Length()

		//String accountNo = "XYZ123";
		//accountNo ="abc123456";
		//int age = 55;
		//String movie ="007";
		//System.out.println(accountNo.length());
		////answer= 9
		
//String CharAt()
		
		//String accountNo = "XYZ123";
		//accountNo ="abc123456";
		//int accountlen=accountNo.length();
		//int age = 55;
		//String movie ="007";
		
		//first charater
		//System.out.println(accountNo.charAt(0));
		
		//testing the last charater in 3 ways
			//System.out.println(accountNo.charAt(5));
		//answer= 3
			//System.out.println(accountNo.charAt(accountlen-1));
		//answer= 6
			//System.out.println(accountNo.charAt(accountNo.length()-1));
			//answer= 6
			
//String Concat()=combines 2 string and adds a value, 

//String accountNo = "XYZ123";
		//int accountlen=accountNo.length();
		//int age = 55;
		//String movie ="007";
		//System.out.println(accountNo.concat("h"));
		//answer= XYZ123h
		
//String accountNo = "XYZ123";
		//int accountlen=accountNo.length();
		//int age = 55;
		//String movie ="007";
		//System.out.println(accountNo+"h");
		//answer=XYZ123h
		
//String Contains()=gives a boolean "true" or "false"
		//this string is used to check if the code is working.
		//System.out.println(accountNo.contains("JK"));
		//System.out.println(accountNo.contains("KJ"));
		//answer=false
		//answer=false
		
		//String StartsWith()=gives a boolean True or false
		//String EndsWith()=gives a boolean True or False
		
//String accountNo = "XYZ1JK23";
		//int accountlen=accountNo.length();
		//int age = 55;
		//String movie ="007";
		//System.out.println(accountNo.contains("JK"));
		//answer=true
		
//String equal=compare of 2 strings
		//1- get the both lengths to compare
		//2-or use the equal
				//String accountNo = "XYZ123JK";
				//int accountlen=accountNo.length();
				//int age = 55;
				//String movie ="007"
				//System.out.println(accountNo.equals("12345JK"));
				//answer-False
				//System.out.println(accountNo.equalsIgnoreCase("XYZ123JK"));
				//answer-True
		
//String Indexof()=location.rreturns int.class what is next to J?
		
			//String accountNo="6565jK5454";
					//where is J?
					//index gives the location
			//System.out.println(accountNo.indexOf("J"));
				    //it is not gonna find it becasue it is capital
					//answer=-1
			//System.out.println(accountNo.indexOf("j"));
					//answer=4
			//System.out.println(accountNo.charAt(5));
					//answer=4
			
//String is Empty()-will give a boolean T/F
		
			//System.out.println(accountNo.isEmpty());
					//answer=False because there are none empty
			//String accountno=""; this is empty so the function will have True.
			//if there is no value then the function will not show
			
			//String accountNo="abc123";
		//String to Uppercase()=makes letters uppercase
			//System.out.println(accountNo.toUpperCase());
					//answer=ABC123
		//String to Lowercase()=makes letters lowercase
			//System.out.println(accountNo.toLowerCase());
					//answer=abc123
		//What do you think trim does? removes the spaces
			
//String trim()
				//String accountNo ="     Hello  Test";
				//System.out.println(accountNo.trim());
					//delete the spaces...extra space on right or left are removed
				//answer=Hello   Test
				
//String replace= replace is used for anything. replaces into new charater
				
				//String accountNo="     Hello     Test     ";
				//System.out.println(accountNo.trim());
						//this string saves the print->this replace will work without triming
						//spaces are removed from left or right
				//System.out.println(accountNo.replace(" ",""));
				//System.out.println(accountNo.replace("ell","3ll"));

				
//String Substring()=will take out what you dont need
				
				//String accountNo="Hello Test";
				
				//System.out.println(accountNo);
				//System.out.println(accountNo.substring(3));
						//answer=lo Test
						//index->always to the end
				//System.out.println(accountNo.substring(1,3));
						//answer=el//answer=lo Test
				

				
				
//String CharArray()=takes the whole string and it made its own charater
		
		//psuedo Code
		//Given:"     Hello    Test    "
		//1.)Replace left and right space
		//2.)Replace all middle space  (Trim)
		//3.)Get the location of the first comma (Indexof)
		//4.)Get from first charater Index value (substring)
		//to first comma Index value, save the value
		//5.)Replace all commas with nothing (Replace)
		//6.)Concat 4 with the rest (Concat)
				
		String Str= "    Hello    Test   ";
		System.out.println(Str);
		Str=Str.trim(); //SAVE override
		System.out.println(Str);
		Str=Str.replace(" ",",");
		System.out.println(Str);
		
		//int firstCommaLoc  =Str.indexOf(",");
		//String firstHalf=Str.substring(0, firstCommaLoc);
		//System.out.println(firstHalf);
		Str=Str.replace(","," ");
		System.out.println(Str);
		
		//int firstHalfLoc = str.indexOf(firstHalf);
		//int firstHalfLoc=firstHalf.length();
		//System.out.println(Str);
		
	}

}
