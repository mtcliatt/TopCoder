import java.util.*;

public class BridgeCrossing {
	public int minTime(int[] times) {
		Arrays.sort(times);
		int count = 0, n = times.length;

		while(true) {
			if(n > 3) {
				int a = 2 * times[1] + times[0] + times[n - 1];
				int b = 2 * times[0] + times[n - 1] + times[n - 2];
				count += Math.min(a, b);
				n -= 2;
			}
			else {
				if(n == 1) {
					count += times[0];
				} else if(n == 2) {
					count += times[1];
				} else if(n == 3) {
					count += times[0] + times[1] + times[2];
				}
				break;
			}
		}

		return count;
	}
}
