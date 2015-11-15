import java.util.*;

public class GoldenChain {
	public int minCuts(int[] sections) {
			Arrays.sort(sections);
			int needed = sections.length;

			if(needed == 1) return 1;

			int at = 0, cuts = 0;
			while(true) {
				if(needed > cuts + sections[at]) {
					needed--;
					cuts += sections[at];
					at++;
				} else {
					return needed;
				}
			}
	}
}
