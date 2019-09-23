package Algorithm;

import java.util.Scanner;

public class FindYourNumber {
public static void main(String[] ar)
{
	int n=Integer.parseInt(ar[0]);
	System.out.println("Enter The Number Between 0 and "+(n-1));
	System.out.println("Give me "+(((int)Math.log(n))+1)+" chances..");
	int low=0;
	int high=n-1;
	findNumber(low,high);
}
public static void findNumber(int low, int high)
{
	int middle=(low+high)/2;
	System.out.println("Enter the value of low or high"+middle+"?");
	Scanner sc=new Scanner(System.in);
	String reply=sc.next();
	if(reply.contentEquals("greater"))
	{
		findNumber(middle+1,high);
	}
	else if(reply.equals("lesser"))
	{
		findNumber(low,middle-1);
	}
	else if(reply.contentEquals("no"))
	{
		System.out.println(middle+ " is the number is not it");
		System.out.println("Thanks a lot");
	}
}
}
