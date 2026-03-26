abstract class Ride {
    int distance;
    abstract void calculateFare();
}

class BikeRide extends Ride {
    void calculateFare() {
        System.out.println(distance * 5);
    }
}

public class RideFareDemo {
    public static void main(String[] args) {
        BikeRide b = new BikeRide();
        b.distance = 10;
        b.calculateFare();
    }
}