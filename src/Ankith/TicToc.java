package com.bridgelab.functional_program;

import java.util.Scanner;

public class TicToc {
	static char board[][]=new char[3][3];
    public static void Display(char board[][]) {
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++) {
    			System.out.print(board[i][j]+" | ");
    		}
    		System.out.println( );		
    	}
    }
    public static void Replace(char board[][],char find,char replace)
    {
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			if(board[i][j]==find)
    			{
    				board[i][j]=replace;
    				return;
    			}
    		}
    	}
    }
    public boolean checkForWin() {
    	return(checkForRow()||checkForColumn()|| checkForDiagonal());
    }
    public boolean checkForRow() {
    	for(int i=0;i<3;i++)
    	{
    		if(check(board[i][0],board[i][1],board[i][2]))
    			return true;
    	}
    	return false;
    }
    public boolean checkForColumn() {
    	for(int i=0;i<3;i++)
    	{
    		if(check(board[0][i],board[1][i],board[2][i]))
    			return true;
    	}
    	return false;
    }
    
    public boolean checkForDiagonal() 
    	{
    		return((check (board[0][0],board[1][1],board[2][2])==true) ||(check(board[0][2],board[1][1],board[2][0])==true));
    	
    	}
    
    public boolean check(char c1,char c2,char c3) {
    	return((c1==c2)&&(c2==c3));
    }
    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
    	String user,computer;
    	System.out.print("enter user name:");
    	user=sc.nextLine();
    	System.out.print("enter computer name:");
    	computer=sc.nextLine();
    	char userMarker,computerMarker;
    	System.out.println(" select Marker(x or 0 :");
    	userMarker=sc.nextLine().charAt(0);
    	while(userMarker!='x'&& userMarker!='x'&& userMarker!='0'&& userMarker!='0')
    	{
    		System.out.println("Invalid input, Enter correct Marker symbol: ");
    		userMarker=sc.nextLine().charAt(0);
    		
    	}
    	
    	if(userMarker=='x'||userMarker=='x') {
    		computerMarker=0;
    	}
    	else {
    		computerMarker='x';
    	}
    	int counter=0;

    	Display(board);
    	char choice;
    	for(int i=0;i<4;i++)
    	{
    		System.out.print(user+" Turn: ");
    		choice=sc.next().charAt(0);
    		Replace(board,choice,userMarker);
    		Display(board);
    		System.out.println(computer+" Turn: ");
    		choice=sc.next().charAt(0);
    		Replace(board,choice,computerMarker);
    		Display(board);
    	}
    	System.out.print(user+" Turn: ");
		choice=sc.next().charAt(0);
		Replace(board,choice,userMarker);
		Display(board);
		TicToc tt=new TicToc();
		if(tt.checkForWin())
			System.out.println(" we have winner");
		else
			System.out.println(" match is draw");
    }


}
