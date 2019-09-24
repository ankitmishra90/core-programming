package programs;

import java.util.Scanner;

public class QuandraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int delta = (b*b) - (4 * a * c);
		double x1 = (-b + Math.sqrt(delta))/(2*a); 
		double x2 = (-b - Math.sqrt(delta))/(2*a); 
		System.out.println("The roots are : " +x1+" , "+x2 );
		
	}

}
