package com.bridgelab.functional_program;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String args[]) {
		double heads=0;
		double tails=0;
		int counter=1;
		 Scanner sc= new Scanner(System.in);
		 System.out.println(" enter how many times u want to flip coin:");
		 double flips=sc.nextDouble();
		 while(counter<=flips)
		 {
			 if(Math.random()<0.5) {
				 heads++;
			 }
			 else {
				 tails++;
			 }
			 counter++;
		 }
			 System.out.println( heads);
			 System.out.println(tails);
			 double h=(heads/flips)*100;
			 double t=(tails/flips)*100;
			 System.out.println();
			 System.out.println("heads% :"+h);
			 System.out.println("tails% :"+t);
			
		
			
		}

}
