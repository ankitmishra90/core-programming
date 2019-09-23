package Algorithm;

public class BinarySearchString {
public static void main(String[] ar)
{
	String[] str= {"ankit","rupesh","kalyan","solanki","poojita","bharti","pooja","varsha"};

	
	int li=0;
	int hi=str.length-1;
	int mi=(li+hi)/2;
	String searchItem="bharti";
	
	while(li<=hi)
	{
		if(str[mi]==searchItem)
		{
			System.out.println("String Item Is Found: "+mi);
			break;
		}
		else if(str[mi]!=searchItem)
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
		System.out.println("Item Is not found:");
}
}
