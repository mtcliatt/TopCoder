import java.util.*;
public class PowerOutage {

	public int estimateTimeOut(int[] fromJunction, int[] toJunction, int[] ductLength)
	{
		int time = 0;
		for(int x : ductLength) {
			time += 2 * x;
		}
		return time - findBranch(0, fromJunction, toJunction, ductLength);
	}

	public int findBranch(int start, int[] from, int[] to, int[] dist)
	{
		int d = 0;
		for(int i = 0; i < from.length; i++) {
			if(from[i] == start)
				d = Math.max(d, findBranch(to[i], from, to, dist) + dist[i]);
		}
		return d;
	}
}
