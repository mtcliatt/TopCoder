import java.util.*;

public class PalindromeMaker
{

	public String make(String baseString)
	{
		int[] hash = new int[26];
		String ret = "";

		for(int i = 0 ; i < baseString.length(); i++)
		{
			hash[baseString.charAt(i) - 'A']++;
		}

		int odds = 0;
		for(int i = 0; i < hash.length; i++)
		{
			if(hash[i] % 2 == 1)
				odds++;
		}

		if(odds > 1)
			return "";

		int middle = -1;

		for(int i = 0; i < hash.length; i++)
		{
			if(hash[i] % 2 == 1)
				middle = i;

			for(int j = 0; j < hash[i] / 2; j++)
			{
				ret +=(char)(i + 'A');
			}

		}

		if(middle != -1)
			ret += (char) (middle + 'A');

		for(int i = ret.length() - 1; i >= 0; i--)
		{
			if(i == ret.length() - 1 && middle != -1)
				continue;

			ret += ret.charAt(i);
		}

		return ret;
	}

}
