class Ticket {
    int seats = 1;

    synchronized void book() {
        if(seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        new Thread(() -> t.book()).start();
        new Thread(() -> t.book()).start();
    }
}