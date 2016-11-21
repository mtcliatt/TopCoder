import java.util.*;

public class CrazyLine {
	public int maxCrazyness(int[] heights) {
		int[] safeCopy = new int[heights.length];

		for(int i = 0; i < heights.length; i++) {
			safeCopy[i] = heights[i];
		}

		return Math.max(arrange(safeCopy, 0), arrange(heights, 1));
	}

	public int arrange(int[] h, int onHigh) {
		Arrays.sort(h);
		LinkedList list = new LinkedList();

		if(h.length == 1)	return 0;
		if(h.length == 2)	return h[1] - h[0];

		if(onHigh == 1) {
			list.add(h[h.length - 1]);
			list.addFirst(h[0]);
			list.add(h[1]);
			h[1] = 0;
		}
		else {
			list.add(h[0]);
			list.add(h[h.length - 1]);
			list.addFirst(h[h.length - 2]);
			h[h.length - 2] = 0;
		}

		h[h.length - 1] = 0;
		h[0] = 0;

		while(list.size() != h.length) {
			int add = findHigh(h);
			if(onHigh == 0) {
				add = findLow(h);
			}

			list.add(h[add]);
			h[add] = 0;

			if(list.size() == h.length)	break;

			add = findHigh(h);
			if(onHigh == 0) {
				add = findLow(h);
			}

			list.addFirst(h[add]);
			h[add] = 0;

			onHigh = (onHigh == 0 ? 1 : 0);
		}

		int diffs = 0;
		for(int i = 0; i < list.size() - 1; i++) {
			diffs += Math.abs((int)list.get(i) - (int)list.get(i+1));
		}

		return diffs;
	}

	public int findHigh(int[] h) {
		int high = -1;
		for(int i = h.length - 1; i >= 0; i--) {
			if(h[i] != 0) {
				high = i;
				break;
			}
		}
		return high;
	}

	public int findLow(int[] h) {
		int low = 0;
		for(int i = 0; i < h.length; i++) {
			if(h[i] != 0) {
				low = i;
				break;
			}
		}
		return low;
	}
}
