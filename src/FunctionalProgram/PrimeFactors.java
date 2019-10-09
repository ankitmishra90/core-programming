package programs;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		prime(n);
		
	}
	
	
	
	public static void prime(int n) 
	{
		/*while(n%2 == 0) 
		{
			System.out.print(2+" ");
			n=n/2;
		}*/
		
		for(int i=2;i<=Math.sqrt(n);i++) 
		{
			while(n%i ==0) 
			{
				System.out.print(i+" ");
				n= n/i;
			}
		}
			if(n>2) 
			
			{
				System.out.print(n+" ");
			} 
		
	}

}
