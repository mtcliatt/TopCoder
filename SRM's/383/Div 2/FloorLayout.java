public class FloorLayout
{

	public int countBoards(String[] layout)
	{

	int ret = 0;
	boolean flag = false;

	for(int i = 0; i < layout.length; i++)
	{
		for(int j = 0; j < layout[i].length(); j++)
		{
			if(!flag && layout[i].charAt(j) == '-')
			{
				ret++;
				flag = true;
			}
			if(flag && layout[i].charAt(j) == '|')
			{
				flag = false;
			}
		}
		flag = false;
	}

	for(int i = 0; i < layout[0].length(); i++)
	{
		for(int j = 0; j < layout.length; j++)
		{
			if(!flag && layout[j].charAt(i) == '|')
			{
				ret++;
				flag = true;
			}
			if(flag && layout[j].charAt(i) == '-')
			{
				flag = false;
			}
		}
		flag = false;
	}

	return ret;

	}

}
