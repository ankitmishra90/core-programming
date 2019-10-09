package programs;

import java.util.Scanner;

public class HArmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		
		int n = scan.nextInt();
	    if(n<0) 
	    {
	    	System.out.println("number should not be zero");
	    }
		for(int i=1;i<=n;i++) 
		{
			sum = sum + ((double)1/i);
			
			
		}
		System.out.println(sum);
		
		
	}

}
