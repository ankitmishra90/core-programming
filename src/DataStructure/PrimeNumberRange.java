package DataStructure;

import java.util.Scanner;

public class PrimeNumberRange {
public static void main(String[] ar)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number:");
	int num=sc.nextInt();
	int sum=0;
	int counter=0;
	int s=0;
	System.out.print("[0-100]  :");
	for(int i=1;i<=num;i++)
	{     
		for(int j=2;j<i-1;j++)
		{
			if(i%j==0)
			{
				sum=sum+i;
			}
		}
		if(sum==0) {
		
			if(counter>=100)
			{    s=s+100;
				System.out.println(" ");
				System.out.print("["+s+"-"+(s+100)+"]:");
				
			
				counter=0;
			}
			System.out.print(i+" ");
		}
		else {
			sum=0;
		}
		counter++;
	}
}
}
