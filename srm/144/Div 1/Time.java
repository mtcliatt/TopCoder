public class Time {

	public String whatTime(int seconds) {
		String ret = "";

		ret += (seconds / 3600) + ":";
		seconds %= 3600;
		ret += (seconds / 60) + ":";
		seconds %= 60;
		ret += seconds % 60;

		return ret;
	}

}
