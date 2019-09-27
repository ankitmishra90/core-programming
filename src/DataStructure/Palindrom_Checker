package DataStructure;

public class Palindrom_Checker {
String queue[]=new String[4];
	
static String size;
int rear;
int front;
public void enQueue(String data)
{
	queue[rear]=data;
	rear=rear+1;
	size=size+1;
}
public String dQueue()
{
	String data=queue[front];
	front=front+1;
  //size=size-1;
	return data;
}
public static void show(String str)
{
	char[] c=str.toCharArray();
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+c[i];
	}
	if(str.equals(rev))
	{
		System.out.println("Palindrom");
	}
	else
	{
		System.out.println("Not Palindrom");
	}
}
public static void main(String[] ar)
{
	Palindrom_Checker q=new Palindrom_Checker();
	
	q.enQueue("madam");
	q.enQueue("radar");
	q.enQueue("toot");
	
	q.enQueue("madamm");
	
	show(q.dQueue());
	show(q.dQueue());
	show(q.dQueue());
	show(q.dQueue());
	
}
}
