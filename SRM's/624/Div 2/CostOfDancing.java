import java.util.*;

public class CostOfDancing
{

	public int minimum(int K, int[] danceCost)
	{
		int sum = 0;
		Arrays.sort(danceCost);
		for(int i = 0; i < K; i++)
		{
			sum += danceCost[i];
		}

		return sum;
	}

}
