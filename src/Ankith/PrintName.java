package com.bridgelab.functional_program;

import java.util.Scanner;

public class PrintName {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name= sc.nextLine();
		int leng=name.length();
		if(leng>=3)
		{
			System.out.println("Hello "+name+", How are you?");
		}
		else
		{
			System .out.println("Invalid name");
		}
	}


}
