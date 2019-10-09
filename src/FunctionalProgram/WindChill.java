package tictactoe;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	double t = Integer.parseInt(args[0]);
	double v = Integer.parseInt(args[1]);
		

	
		if(t>50 || v > 120 || v < 3) {
			System.out.println("Not valid");
			return;
		}
	
	   
        
		
		double val = Math.pow(v, 0.16);
		
		double w = 35.74 + (0.6215*t) + (((0.4275 * t) - 35.75) * val); 
		System.out.println("The effective temperature is: "+w);
		
		
		}

}
