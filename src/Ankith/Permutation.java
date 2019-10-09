package com.bridgelab.functional_program;

public class Permutation {
	public static void main(String[] args) {
		String str="abc";
		int n=str.length();
		Permutation pm=new Permutation();
		pm.permute(str,0,n-1);
	}


private void permute(String str,int k,int r) {
if(k==r)
{
	System.out.println( str );
}
	else
	{
		for(int i=0;i<=r; i++)
		{
			str=swap(str,k,i);
					permute(str,k+1,r);
					str=swap(str,k,i);
		}
	}
}
public String swap(String a,int i,int j)
{
	char temp;
	char[] charArray=a.toCharArray();
	temp=charArray[i];
	charArray[i]=charArray[j];
	charArray[j]=temp;
	return String.valueOf(charArray);
}

}
