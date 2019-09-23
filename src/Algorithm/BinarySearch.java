package Algorithm;

public class BinarySearch {
public static void main(String[] ar)
{
	int arr[]= {1,3,5,6,7,9,11,14,16,18};
	int li=0;
	int hi=arr.length-1;
	int mi=(li+hi)/2;
	int item=11;
	while(li<=hi)
	{
		if(arr[mi]==item)
		{
			System.out.println("item is founded="+mi);
			break;
		}
		else if(arr[mi]<=item)
		{
			li=mi+1;
		}
		else
		{
			hi=mi-1;
		}
		mi=(li+hi)/2;
	}
	if(li>hi)
	{
		System.out.println("item is not found:");
	}
}
}
