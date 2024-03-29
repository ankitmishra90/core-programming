package DataStructure;
class QueueUsingToStack {
	
	static Stack s1=new Stack();
	static Stack s2=new Stack();
	static void enQueue(int x)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(x);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		//s2.pop();
	}
	static int dQueue()
	{
		if(s1.isEmpty())
		{
			System.out.println("Q is empty: ");
			System.exit(0);
		}
		int x=s1.peek();
		s1.pop();
		return x;
}
public static void main(String[] ar)
{
	QueueUsingToStack q=new QueueUsingToStack();
	q.enQueue(1);
	q.enQueue(2);
	q.enQueue(3);
	
	
	System.out.println(q.dQueue());
	System.out.println(q.dQueue());
	System.out.println(q.dQueue());
	
}
}
