package Cards;

import java.util.Random;

public class DeckOfCards {
	public static void cards() {
		String names[]= {"Player1", "Player2","Player3", "Player4"};
		String rank[]= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		Random ob=new Random();
		for(int i=0;i<4;i++) {
			System.out.print(names[i]+"::");
			for(int j=0;j<9;j++) {
				
				System.out.print(rank[ob.nextInt(((12-0)+1)+0)]+" ");
			}
			System.out.println("");
			
		}
	}
public static void main(String[] ar)
{
	cards();
	
}
}
