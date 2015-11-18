public class AdditionCycles
{

	public int cycleLength(int n)
	{
		int original = n;
		int turns = 1;

		int at = transform(n);
		while(at != original)
		{
			at = transform(at);
			turns++;
		}

		return turns;
	}

	public int transform(int n)
	{
		int sumDigits = (n / 10) +  (n % 10);
		String concat = "";
		concat += n % 10;
		concat += sumDigits % 10;

		return Integer.parseInt(concat);

	}


}
