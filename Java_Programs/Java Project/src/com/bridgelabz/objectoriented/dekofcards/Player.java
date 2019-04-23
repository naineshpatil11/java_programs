package com.bridgelabz.objectoriented.dekofcards;

public class Player
{ 
	
	public static void main(String[] args) 
	{
		String playercard[][] = Util.cardDistribute();
		Queue<Queue<String>> sortedcard = Util.cardSort(playercard);
		String playername[] = {"Player 1","Player 2","Player 3","Player 4"};
		int index = 0;
		while(!sortedcard.isEmpty())
		{
			Queue<String> temp = sortedcard.dequeue();
			System.out.print(playername[index]+"--> ");
			while(!temp.isEmpty())
			{
				System.out.print(temp.dequeue()+"  ");
			}
			System.out.println();
			index++;
		}	
	}

}
