package DataStructure;

public class Stack {
static int stack[] =new int[5];
int top=0;
public void push(int data)
{
	 stack[top]=data;
	 top=top+1;
}
public int pop()
{
	top--;
	int data=stack[top];
	//stack[top]=0;
	
	return data;
}
public int peek()
{
	int data=stack[top-1];
	return data;
}
public int size()
{
	return top;
}
public boolean isEmpty()
{
	return top<=0;
}
public static void show()
{
	System.out.println("Element is:");
	for(int n:stack)
	{
		System.out.println(n+" ");
	}
}
public static void main(String[] ar)
{
	Stack num=new Stack();
	num.push(5);
	num.push(7);
	num.push(2);
	num.push(15);

	System.out.println("pop element :"+num.pop());
	
	num.push(3);
	num.push(11);
	
	System.out.println("peek element :"+num.peek());
	System.out.println("size =  "+num.size());
	System.out.println("isEmpty ="+num.isEmpty());
	show();
}
}
