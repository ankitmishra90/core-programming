package Algorithm;


public class BubbleSortString {
public static void main(String[] ar)
{
	String[] str= {"ankit","rupesh","kalyan","solanki","poojita","bharti","pooja","komal"};
	
	
	
	
	for(int i=0;i<str.length;i++)
	{
		for(int j=0;j<str.length-1;j++)
		{
			if(str[j].compareTo(str[j+1])>0)
			{
				String temp=str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
		}
	}
	
	
	
	
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
}
}
