public class BearSong {
	public int countRareNotes(int[] notes) {
		int[] hash = new int[1001];
		int total = notes.length;

		for (int i = 0; i < notes.length; i++) {
			hash[notes[i]]++;
			//If this is the first time a note has repeated, we need to count off twice because it's first appearance
			//and each one after count away from the total rare notes.
			if(hash[notes[i]] == 2) {
				total--;
			}
			if(hash[notes[i]] > 1) {
				total--;
			}
		}


		return total;
	}
}
