import java.util.*;

public class VendingMachine {

	public int motorUse(String[] prices, String[] purchases)
	{
		int seconds = 0;
		int columns = 1;
		int shelves = prices.length;

		for(int i = 0; i < prices[0].length(); i++)
		{
			if(prices[0].charAt(i) == ' ')
				columns++;
		}

		int[][] p = new int[columns][shelves];

		Scanner scan;
		for(int i = 0; i < prices.length; i++)
		{
			scan = new Scanner(prices[i]);
			for(int j = 0; scan.hasNext(); j++)
			{
				p[j][i] = Integer.parseInt(scan.next());
			}
		}

		seconds += getMoves(0, getMax(p), p.length);

		int current = getMax(p);
		int previousTime = 0;

		for(int i = 0; i < purchases.length; i++)
		{
			String sub = purchases[i];
			int shelf = Integer.parseInt(sub.substring(0, sub.indexOf(',')));
			int column = Integer.parseInt(sub.substring(sub.indexOf(',')+1, sub.indexOf(':')));
			int time = Integer.parseInt(sub.substring(sub.indexOf(':')+1));
			int maxColumn = getMax(p);

			if(p[column][shelf] == 0)
				return -1;

			if(time >= previousTime + 5)
			{
				int toMax = getMoves(current, maxColumn, columns);
				current = maxColumn;

				seconds += toMax;
				System.out.println("SECONDS = " + seconds);

				int maxtoc = getMoves(current, column, columns);
				//System.out.println("Going from max at " + current + " to column at " + column + " for " + maxtoc + " seconds");
				current = column;

				seconds += maxtoc;
			}
			else
			{
				//System.out.println("Going from current at " + current + " to column at " + column + " for " + getMoves(current, column, columns) + " seconds");
				seconds += getMoves(current, column, columns);
			}

			p[column][shelf] = 0;
			previousTime = time;
			current = column;
			//System.out.println("SECONDS = " + seconds + "\n");
		}

		return seconds + getMoves(current, getMax(p), columns);
	}

	public int getMax(int[][] p)
	{
		Scanner scan;
		int max = 0;
		int column = 0;

		for(int i = 0; i < p.length; i++)
		{
			int temp = 0;
			for(int j = 0; j < p[i].length; j++)
			{
				temp += p[i][j];
			}

			if(temp > max)
			{
				column = i;
				max = temp;
			}
		}

		return column;
	}

	public int getMoves(int source, int dest, int columns)
	{
		int forward = Math.abs(dest - source);
		int back    = (source > dest ? (columns - source) + dest : (columns - dest) + source);
		return Math.min(forward, back);
	}

}
