package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Coupon {

	public static void main(String args[]) 
	{
		System.out.println("Enter number of coupons:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean isNew[] = new boolean[n];
		int count = 0;
		int distinct = 0;
		
		while(distinct<n) 
		{
			
		int val= (int)(Math.random()*(n));
		
		count++;
	
		if(!isNew[val]) 
		{
			distinct++;
			isNew[val] = true;
		}
		}
		
		System.out.println("The number of random numbers generated to collect all distinct number is: "+count);
		
	}
	
}
