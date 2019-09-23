package Algorithm;

public class InsertionSortString {
public static void main(String[] ar)
{
	String[] str= {"ankit","rupesh","kalyan","solanki","poojita","bharti","pooja","komal"};
	
	String []arr=sort_sub(str , str.length);
	for(int i=0;i<str.length;i++)
	{
		System.out.print(str[i]+" ");
	}
}
public static String[] sort_sub(String[] array,  int f)
{
	String temp="";
	for(int i=0;i<f;i++){
		for(int j=i+1;j<f;j++){
		if(array[i].compareToIgnoreCase(array[j])>0){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
		}
		return array;
		}
}
