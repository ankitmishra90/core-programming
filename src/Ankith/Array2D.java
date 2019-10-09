package com.bridgelab.functional_program;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		int row,col,i,j;
		int arr[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row from array(max 10): ");
		row=sc.nextInt();
		System.out.println(" enter col from array(max 10): ");
		col=sc.nextInt();
		System.out.println(" Enter "+(row*col)+" Array Element");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{ 
				
		      	arr[i][j]=sc.nextInt();
		      	
			}
		}
		System.out.println(" the array is :");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{ 
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}


}
