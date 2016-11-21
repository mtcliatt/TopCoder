public class BearSlowlySorts {
	public int minMoves(int[] w) {

		boolean isSorted = true;
		int min = w[0];
		int max = w[0];

		for (int i = 0; i < w.length; i++) {
			if (i < w.length - 1 && w[i] > w[i+1]) {
				isSorted = false;
			}

			if (w[i] < min) {
				min = w[i];
			}

			if(w[i] > max) {
				max = w[i];
			}
		}

		if (isSorted) {
			return 0;
		}

		if (w[0] == max && w[w.length-1] == min) {
			return 3;
		}

		if (w[0] == min || w[w.length-1] == max) {
			return 1;
		}

		return 2;

	}
}
