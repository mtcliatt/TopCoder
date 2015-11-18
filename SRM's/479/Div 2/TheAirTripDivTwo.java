public class TheAirTripDivTwo {
    public int find(int[] flights, int fuel) {
        int total = 0;

        for (int i = 0; i < flights.length; i++) {
            fuel -= flights[i];
            if (fuel < 0) {
                break;
            }
            total++;
        }

        return total;
    }
}
