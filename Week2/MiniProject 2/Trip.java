public abstract class Trip {
    private String tripNumber;
    private double distance;
    private double speed;
    private String startTime;

    public Trip(String tripNumber, double distance, double speed, String startTime) {
        this.tripNumber = tripNumber;
        this.distance = distance;
        this.speed = speed;
        this.startTime = startTime;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public abstract int calculateDuration();

    public double convertMinToHour(int min) {

        return min / 60.0;
    }

    public String calculateArrivalTime() {
        double u = calculateDuration();
        return "you will arrive at your destination after (" + u + ") hours";
    }
}
