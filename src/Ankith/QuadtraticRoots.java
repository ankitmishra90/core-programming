package com.bridgelab.functional_program;

import java.util.Scanner;

public class QuadtraticRoots {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a : ");
		double a=sc.nextDouble();
		System.out.println("enter the value of b : ");
		double b=sc.nextDouble();
		System.out.println("enter the value of c : ");
		double c=sc.nextDouble();
	
			 double root1= (-b + ( b*b - 4*a*c )) /(2*a);
	         double root2= (-b - ( b*b - 4*a*c )) /(2*a);
			System.out.println("The roots1 are: "+ root1);
			   System.out.println("The roots2 are: " + root2);


		}


}
