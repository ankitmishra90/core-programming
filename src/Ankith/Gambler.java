package com.bridgelab.functional_program;

import java.util.Scanner;

public class Gambler {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the value of stack: ");
		int stack=sc.nextInt();
		System.out.print(" enter no of goals: ");
		int goal=sc.nextInt();
		System.out.print(" enter value of trails: ");
		int trails=sc.nextInt();
		int bets=0;
		int wins=0;
	
		for(int i=0;i<=trails;i++) {
		int cash=stack;
		while(cash>0&&cash<goal) {
			bets++;
			if(Math.random()<0.5) {
				cash++;}
			else {
				cash--;}
		}
			if(cash==goal) {
                 wins++;}

				
			}
			System.out.println(wins+" win of "+trails);
			System.out.println("percent of game won="+ (100.0*wins)/(trails));
			System.out.println(" Avg bets="+ (1.0*bets)/(trails));
			
	
	

}}


