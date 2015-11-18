public class StringSegment
{

	public double average(String s)
	{
		double segs = 0;
		char cur = '0';

		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != cur)
			{
				cur = s.charAt(i);
				segs++;
			}
		}
		System.out.println("Division - " + s.length() + " / " + segs);
		return s.length() / segs;
	}

}
