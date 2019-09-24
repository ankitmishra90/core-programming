package com.bridgelab.functional_program;

import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String args[]) {
		double n,i;
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the value of N:=");
		n=s.nextDouble();
		for(i=1;i<=n;i++) {
			if(i==1)
				System.out.print("1 +");
				else if(i==n)
					System.out.print("1/ " +i);
				else
					System.out.print("1/"  +i+ "  ");
				
		}
		
		System.out.println();
	}

}
