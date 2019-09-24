package programs;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	static OutputStreamWriter console = new OutputStreamWriter(System.out);
	static PrintWriter out = new PrintWriter(console);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = scan.nextInt();
		
		System.out.println("Enter the values: ");
		int array[][] = new int[row][col];
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				array[i][j] = scan.nextInt();
			}
		}
		
		print(array,row,col);
	}
	
	public static void print(int array[][], int row, int col) throws IOException 
	{
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
			  out.write(array[i][j]+" ");
			  out.flush();
			}
			System.out.println();		}
		
		
	}

}
