package com.bridgelabz.objectoriented.dekofcards;

public class DeckOfCards
{
	public static void main(String[] args) 
	{
		String playercard[][] = Util.cardDistribute();
		int x = 0,y = 0;
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Player"+(i+1)+"\t");
			for(int j = 0; j < 9; j++)
			{
				System.out.println(playercard[x][y]+"\t");
				if(y == 9)
				{
					y = 0;
					x++;
				}
				System.out.println();
			}
		}
	}
}
