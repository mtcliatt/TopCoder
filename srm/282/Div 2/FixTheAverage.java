public class FixTheAverage
{

	public double add(double[] list, double target)
	{
		double sum = 0;
		for(int i = 0; i < list.length; i++)
		{
			sum += list[i];
		}

		double x = target * (list.length + 1) - sum;

		return x;
	}

}
