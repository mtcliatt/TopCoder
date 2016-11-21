public class YahtzeeScore {

	public int maxPoints(int[] toss) {
		int ret = 0;
		int hash[] = new int[6];

		for(int i = 0; i < toss.length; i++) {
			hash[toss[i] - 1]++;
		}

		for(int i = 0; i < hash.length; i++) {
			if( (i+1) * hash[i] > ret )
				ret = (i+1) * hash[i];
		}

		return ret;
	}

}
