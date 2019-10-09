package DataStructure;

public class QueueTest
{
	int queue[]=new int[5];
   static int size;
    int front;
    int rear;
	public void enQueue(int data){
        queue[rear]=data;
        rear=(rear+1)%5;
        size=size+1;
    }
    public int dQueue()
    {
    	int data=queue[front];
    	front =(front+1)%5;
    	size=size-1;
    	return data;
    }
    public void show()
    {
    	System.out.println("Element is:");
        for(int i=0;i<size;i++)
        {
        	System.out.println(queue[(front+i)%5]+" ");
        }
        System.out.println("Element array:");
        for(int n:queue)
        {
        	System.out.print(n+" ");
        }
    }
    public int getSize()
    {
    	return size;
    }
    public boolean isEmpty() 
    {
    	return size==0;
    }
    public boolean isFull()
    {
    	return size==5;
    }
    public static void main(String[] ar)
    {
    	QueueTest q=new QueueTest();
    	q.enQueue(5);
    	q.enQueue(6);
    	q.enQueue(2);
    	q.enQueue(1);
    	q.enQueue(3);
    	
    	
    	q.dQueue();
    	q.dQueue();
    	
    	
    	//q.enQueue(7);
    	//q.enQueue(4);
    	
    	System.out.println("Size="+ q.getSize());
    	
    	System.out.println(q.isEmpty());
    	System.out.println(q.isFull());
    	q.show();
    	
    	
    	
    	
    }
    }