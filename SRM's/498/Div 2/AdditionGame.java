import java.util.*;

public class AdditionGame
{
	public int getMaximumPoints(int A, int B, int C, int N)
	{
		int[] nums = {A, B, C};
		int points = 0;

		for(int i = 0; i < N; i++)
		{
			Arrays.sort(nums);
			if(nums[2] <= 0)
				break;
			points += nums[2]--;
		}

		return points;
	}
}
