package programs;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of elements int he array: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter elements in the array:");
		int array[] = new int[n];
		for(int i=0;i<n;i++) 
		{
			array[i] = scan.nextInt();
		}
		int sum =0;
		int count = 0;
		System.out.println("Numbers which sums to zero is: ");
		for(int i=0;i<n-2;i++) 
		{
			for(int j=1;j<n-1;j++) 
			{
				for(int k=2;k<n;k++) 
				{
					 sum = array[i] + array[j] + array[k];
					 if(sum ==0) 
					 {
						 count++;
						 System.out.println(array[i] + " "+ array[j]+ " "+ array[k]);
					 }
				}
			}
		}
		System.out.println("the number of tripletsis "+count );
	}
	

}
