public class Airplane extends Trip {
    public Airplane(String tripNumber, double distance, double speed, String startTime) {
        super(tripNumber, distance, speed, startTime);
    }

    @Override
    public int calculateDuration() {

        return (int) (getDistance() / getSpeed() * 1 / 10);
    }
}
