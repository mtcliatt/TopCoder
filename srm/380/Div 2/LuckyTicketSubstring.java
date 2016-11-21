public class LuckyTicketSubstring
{

	public int maxLength(String s)
	{
		int ret = 0;

		for(int i = s.length(); i > 1; i--)
		{
			if(i % 2 == 1)
				continue;

			if(ret != 0)
				break;

			System.out.println("Testing strings of length: " + i);

			for(int j = 0; j + i <= s.length(); j++)
			{
				System.out.println("Testing string starting at index: " + j);

				String test = s.substring(j, j + i);

				System.out.println("Testing \"" + test + "\"");

				if(isLucky(test))
				{
					ret = i;
					break;
				}

			}

			System.out.println("\n");

		}

		return ret;

	}

	public boolean isLucky(String test)
	{
		boolean flag = false;

		String first = test.substring(0, test.length() / 2);
		String last  = test.substring(test.length() / 2);

		int fsum = 0, ssum = 0;

		for(int i = 0; i < first.length(); i++)
		{
			fsum += first.charAt(i);
			ssum += last.charAt(i);
		}

		if(fsum == ssum)
			flag = true;

		System.out.println("In isLucky, testing " + first + " against " + last + " === " + flag);

		return flag;
	}

}
