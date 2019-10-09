package DataStructure;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import Algorithm.Util;

public class orderedList {
public static void main(String[] ar) throws IOException
{
	Scanner sc=new Scanner(System.in);
	String []str=Util.readFromFile();
	LinkedList list=new LinkedList();
	for(int i=0;i<str.length;i++)
	{
		list.add(str[i]);
	}
	list.add("Ankit");
	list.add("suresh");
	list.add("Mahesh");
	System.out.println("My list is"+list);
	System.out.println("Enter word for search");
	String s=sc.next();
	search(list,s);
}

static void search(LinkedList list,String str) {
	int f=0;
	for(int i=0;i<list.size();i++)
	{    
		if(str.equalsIgnoreCase((String) list.get(i))) {
		   	f=1;
		   	break;
		}
	}
	if(f==1) {
		System.out.println("Matched");
	} else {
		System.out.println("Not Matched");
	}
	
}
}
