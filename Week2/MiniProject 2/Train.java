public class Train extends Trip {
    public Train(String tripNumber, double distance, double speed, String startTime) {
        super(tripNumber, distance, speed, startTime);
    }


    @Override
    public int calculateDuration() {
        return (int) (getDistance() / getSpeed() * 1 / 3);

    }
}
