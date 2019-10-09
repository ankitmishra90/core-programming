package programs;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the stake value:");
		int stake = scan.nextInt();
		System.out.println("Enter goal :");
		int goal = scan.nextInt();
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		int count = 0;
		int win = 0;
		
		
	while(num>=count && stake>0 && stake<goal) 
		{
		
			
			double val = Math.random();
			if(val>0.5) 
			{
				stake++;
				win++;
			}
			else 
			{
				stake--;
			}
			count++;
			
		}
	System.out.println(win);
	
	System.out.println("percentage of win VS loss:");
	System.out.println("win percentage : " + (win*100)/count);
	System.out.println("loss percentage : " + (((count-win)*100)/count));
	
	
		
		
		

	}

}
