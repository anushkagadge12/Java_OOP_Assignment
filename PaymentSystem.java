abstract class Payment {
    abstract void pay(double amt);
}

class UPIPayment extends Payment {
    void pay(double amt) {
        System.out.println("UPI: " + amt);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p = new UPIPayment();
        p.pay(500);
    }
}