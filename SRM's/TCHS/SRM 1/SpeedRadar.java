public class SpeedRadar
{
	public double averageSpeed(int minLimit, int maxLimit, int[] readings)
	{
		double total = 0;
		double badCars = 0;

		for(int i = 0; i < readings.length; i++)
		{
			if(readings[i] < minLimit || readings[i] > maxLimit)
				badCars++;
			else
				total += readings[i];
		}

		if( readings.length / 10 < badCars )
			return 0.0;

		return total / (readings.length - badCars);
	}
}
