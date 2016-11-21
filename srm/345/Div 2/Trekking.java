public class Trekking
{
	public int findCamps(String trail, String[] plans)
	{
		int ret = -1;

		for(int i = 0; i < plans.length; i++)
		{
			if(ret == 0) break;

			int temp = 0;
			for(int j = 0; j < plans[i].length(); j++)
			{
				if(plans[i].charAt(j) == 'C' && trail.charAt(j) == '^')
				{
					temp = -1;
					break;
				}
				else if(plans[i].charAt(j) == 'C')
				{
					//System.out.println("camping validly");
					temp++;
				}
			}

			if(ret == -1)
			{
				ret = temp;
				continue;
			}

			if(temp != -1 && temp < ret)
				ret = temp;

		}

		return ret;

	}

}
