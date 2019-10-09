package com.bridgelab.functional_program;

import java.util.Scanner;

public class Distance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the value of x");
		int x=sc.nextInt();
		System.out.println("enter the value of y");
		int y=sc.nextInt();
		double dist=Math.sqrt(x*x+y*y);
		System.out.println("Distance from("+x+","+y+")to (0,0)="+dist);
	}

}
