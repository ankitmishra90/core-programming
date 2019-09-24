package programs;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username: ");
		String username = scan.next();
		
	    String welcome = "Hello <<UserName>>, How Are You";
	    if(username.length() < 3) 
	    {
	    	System.out.println("Please enter a string length greater than 3 ");
	    }
	  ;
		System.out.println(welcome.replace("<<UserName>>", username));
	}

}
