public class ExerciseMachine {
	public int getPercentages(String time) {
		double seconds = 0;
		double ret = 0;

		seconds += Integer.parseInt(time.substring(0, time.indexOf(':'))) * 60 * 60;
		time = time.substring(time.indexOf(':') + 1);
		seconds += Integer.parseInt(time.substring(0, time.indexOf(':'))) * 60;
		time = time.substring(time.indexOf(':') + 1);
		seconds += Integer.parseInt(time);

		for(int i = 1; i < 100; i++) {
			if( ((i * .01) * seconds) % 1 == 0) {
				ret = 100 / i - 1;
				break;
			}
		}

		return (int)ret;
	}
}
