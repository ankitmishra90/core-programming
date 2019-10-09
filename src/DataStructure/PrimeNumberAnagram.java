package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberAnagram {
int[] queue;
int size;
int rear;
int front;
static ArrayList<Integer> list;
PrimeNumberAnagram(int size) {
	this.size=size;
	queue=new int[this.size];
	rear=-1;
	front=-1;
	list=new ArrayList<Integer>();
}

public void enQueue(int data)
{
	queue[++rear]=data;
	size=rear+1;
	
}
public int dQueue()
{
	int data=queue[++front];
	size=size-1;
	return data;
}
public static void show(int num)
{
	int f=0;
	if(num==0||num==1||num==2)
	{
		return;
	}
	else {
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				 f=1;
				 break;
			}
		}
		if(f==0)
		{
			System.out.println(num);
			list.add(num);
		}
	}
}	
public static int  count(int num) {
	int c=0;
	while(num!=0) {
		int d= num%10;
		num=num/10;
		c++;
		
	}
	return c;
	
}

public static int[] digitSeparate(int num) {
	int[] arr=new int[count(num)];
	int i=0;
	while(num>0) {
		int d= num%10;
		arr[i]=d;
		num=num/10;
		i++;
		
	}
	return arr;
}
public static void Angram(ArrayList<Integer> list) {
	System.out.println(list);
	for(int i=0;i<list.size();i++) {
		int[] arr=digitSeparate(list.get(i));
		Arrays.sort(arr);
		for(int j=i+1;j<list.size();j++) {
			int[] arr1=digitSeparate(list.get(j));
			Arrays.sort(arr1);
			if(Arrays.equals(arr,arr1)){
				System.out.print(list.get(j)+ " ");
				
			}
			
		}
	}
	
		
	
	
}
	public static void main(String[] ar)
	{
		PrimeNumberAnagram q=new PrimeNumberAnagram(1000);
		for(int i=0;i<1000;i++)
		q.enQueue(i);
		for(int i=0;i<1000;i++)
		show(q.dQueue());
		 System.out.println("Angram");
		Angram(list);
		//show(sum);
	}
}
