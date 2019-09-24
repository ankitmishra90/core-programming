package com.bridgelab.functional_program;

import java.util.Scanner;

public class WindChill {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter value of t: ");
		
		double t=sc.nextDouble();
		System.out.println("enter value of v: ");
		
		double v=sc.nextDouble();
		
		if(t<=50||v<3||v<=120)
{
		
			
		
			double w=35.74+0.6215*t+(0.4258*t-35.75)*Math.pow(v, 0.16);
		    System.out.println(t);
		    System.out.println(v);
		    System.out.println(w);
		    
		
	}
		else {
			System.out.println(" invalid value of t and v ");
		}

	}

}
