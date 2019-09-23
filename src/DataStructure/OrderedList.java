package DataStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class OrderedList {

	static Scanner sc=new Scanner(System.in);
	static int count=0;
	static String file="ordered.txt.";
	
	static String[] readFromFile() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("value.txt"));
	  String str=br.readLine();
	  String[] str1=str.split(",");
	  
		return str1;
		
	}
	public static void main(String[] ar) throws IOException
	{
		LinkedList list=new LinkedList();
		String str[]=readFromFile();
		int arr[]=new int[str.length];
		for(count=0;count<str.length-1;count++)
		{
			arr[count]=Integer.parseInt((str[count]));
			list.add(arr[count]);
		}
		//list.show();
		System.out.println("Enter The Operation:");
		String str2=sc.next();
		switch(str2)
		{
		case "add" :
			System.out.println("Enter The Number:");
			int val=sc.nextInt();
			add(val , arr , list);
		}
	}
		public static void add(int val , int arr[],  LinkedList list ) throws IOException
		{
			list.add(val);
			arr[++count] = val;
			//list.writeOnFile(file,arr,val);
		}
	}
