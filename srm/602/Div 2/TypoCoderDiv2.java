public class TypoCoderDiv2
{

	public int count(int[] rating)
	{
		int last = 500;
		int ret = 0;
		for(int i = 0; i < rating.length; i++)
		{
			if(last < 1200 && rating[i] >= 1200)
				ret++;
			else if(last >= 1200 && rating[i] < 1200)
				ret++;

			last = rating[i];
		}

		return ret;

	}

}
