package DataStructure;

import java.util.Scanner;


import com.sun.corba.se.impl.util.Utility;

import Algorithm.Util;

public class Calendar {
static int calender[][]=new int[6][7];
public static void main(String[] ar)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The Year:");
	int year=sc.nextInt();
	System.out.println("Enter The month:");
	int month=sc.nextInt();
System.out.println("sun"+"    "+"mon"+"     "+"tue"+"     "+"wen"+"     "+"thu"+"      "+"fri"+"    "+"sat");
	int r=1;
	int c=getTheDay(year,month);
	
	int val=1;
	
	for(int i=c;i<7;i++)
	{
		calender[0][i]=val++;
	}
	
	while(val <= getDaysInMonth(month,year) && r<5) {
		
		for(int i=0;i<7;i++)
		{
			calender[r][i]=val++;
			if(val>getDaysInMonth(month, year))
			{
				break;
			}
		}
		r++;
	}
	print();
}
	public static int getTheDay(int y,int m)
	{
		int d=1;
		int y0 = y - ((14 - m) / 12);
		int	x = y0 + (y0/4) - (y0/100) +(y0/400);
		int m0 = m + (12 * ((14 - m) / 12)) - 2;
		int d0 = (d + x + ((31*m0) / 12)) %  7;
	   return d0;
	}
	public static int getDaysInMonth(int month, int year) 
	{

		
		if((Util.leapYear(year)==true)&& (month==2))
		{
			return 29;
		} 
		else
		{
			int days [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		return days[month-1];
		}
	}
	
	// print calendar
	
	public static void print() 
	{
		for(int i=0;i<5;i++) 
		{
			System.out.print(" ");
			for(int j=0;j<7;j++) 
			{
				if(calender[i][j]!=0) {
				System.out.print(calender[i][j]+"\t");
				}
				}
			System.out.println();
		}
}
}
