public class Main {
    public static void main(String[] args) {
        Trip i = new Car("1234", 1000, 90, " 6:00 AM ");
        Trip i1 = new Train("4567", 1000, 90, " 6:00 AM ");
        Trip i2 = new Airplane("9845", 1000, 90, " 6:00 AM ");

        System.out.println(i.calculateDuration());
        System.out.println(i1.calculateDuration());
        System.out.println(i2.calculateDuration());

        System.out.println(i.calculateArrivalTime());
        System.out.println(i1.calculateArrivalTime());
        System.out.println(i2.calculateArrivalTime());

        System.out.println(i.convertMinToHour(369));


    }
}
