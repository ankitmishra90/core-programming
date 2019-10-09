package programs;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int head =0;
        int tails =0;
		System.out.println("Enter the number of times Flip coin: ");
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		for(int i=0;i<number;i++) {
		
		double val = Math.random();
		
		if(val > 0.5) {
			head++;
		}
		else 
		{
			tails++;
		}
		
		 
		}
		System.out.println("Prcentage head VS tails");
		
		
		System.out.println("Heads:" +(head*100)/number+"%");
		System.out.println("Tails:" + (tails*100)/number+"%");
		
		
		
	}

}
