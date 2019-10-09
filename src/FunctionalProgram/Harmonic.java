package FunctionalProgram;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] ar)
	{
	float sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The number:");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
	sum=sum+(float)1/i;
	}
	System.out.println(sum);
	}
}
