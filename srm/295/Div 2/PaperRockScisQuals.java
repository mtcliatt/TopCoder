public class PaperRockScisQuals
{

	public int whoPassed(String[] players)
	{
		int ret = 0;
		double high = -1;

		for(int i = 0; i < players.length; i++)
		{
			int playerIndex = i;
			double points = getPoints(i, players);
			//System.out.println("Current high = " + high + ", current player scores: " + points);
			if(points > high)
			{
				high = points;
				ret = i;
			}
		}

		return ret;
	}

	public double getPoints(int index, String[] players)
	{
		double points = 0;

		for(int i = 0; i < players.length; i++)
		{
			if(index == i)
				continue;

			int won = 0;
			int lost = 0;
			for(int j = 0; j < players[i].length(); j++)
			{
				if(players[index].charAt(j) == players[i].charAt(j))
					continue;

				if(players[index].charAt(j) == 'P')
				{
					if(players[i].charAt(j) == 'R')
						won++;
					else
						lost++;
				}
				else if(players[index].charAt(j) == 'R')
				{
					if(players[i].charAt(j) == 'S')
						won++;
					else
						lost++;
				}
				else
				{
					if(players[i].charAt(j) == 'P')
						won++;
					else
						lost++;
				}

			}

			if(won > lost)
				points += 1;
			else if(won == lost)
				points += .5;
		}

		return points;
	}

}
