public class DivisorDigits
{
	public int howMany(int number)
	{
		int ret = 0;
		int temp = number;

		while(true)
		{
			int d = temp % 10;
			temp /= 10;

			if(d != 0 && number % d == 0)
				ret++;

			if(temp == 0)
				break;

		}

		return ret;
	}
}
