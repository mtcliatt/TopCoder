public class ImageDithering
{

	public int count(String dithered, String[] screen)
	{
		int c = 0;
		for(int i = 0; i < screen.length; i++)
		{
			for(int j = 0; j < screen[i].length(); j++)
			{
				if(dithered.contains(screen[i].charAt(j) + ""))
					c++;
			}
		}

		return c;
	}
}
