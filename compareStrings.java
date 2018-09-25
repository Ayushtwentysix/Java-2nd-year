// PRE-DEFINED METHODS
// nextLine
// .equals
// .equalsIgnoreCase
// .indexOf
// .split

import java.util.Scanner;

public class compareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the name");
		Scanner s1 = new Scanner(System.in);
		String n1 = s1.nextLine();
		
		System.out.println("Enter the college name");
		Scanner s2 = new Scanner(System.in);
		String n2 = s2.nextLine();
		
//             Checks the string		
//		if(n1.equalsIgnoreCase(n2))                             // removes case sensitivity
//		System.out.println("Strings are equal");
//		else
//			System.out.println("Strings are not equal");
		
		
//                      check authorize users  
		
//		if(n1.equalsIgnoreCase("admin") && n2.equalsIgnoreCase("GLA"))
//			System.out.println("You are an authorized user");
//		else
//			System.out.println("you are not an authorized user");
		
		
//            !!! take a string from user and tell if it has space	!!!	
		
		// ay b -ka O/P: you have used space at: 2
		                      
		System.out.println("Enter only one string");
		Scanner s3 = new Scanner(System.in);
		String n3 = s3.nextLine();
		
//		int x = n3.indexOf(" "); // if no space here, then it will search for null character
//		if(x== -1)
//			System.out.println("you have not used space");
//		else
//			System.out.println("you have  used space at: "+x);
		
//                 !!! Count number of spaces are there in a string !!!
//		String arr[] = n3.split(" ");
//		System.out.println("No. of spaces used: "+(arr.length-1));
		
//		  !!! Count number of spaces are there in a string !!!
		String arr[] = n3.split(" ");
	System.out.println("No. of spaces used: "+arr.length);
		
	}

}