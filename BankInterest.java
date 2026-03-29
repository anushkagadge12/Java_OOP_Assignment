public class BankInterest {
    final double rate = 5;

    double calculate(double amt) {
        return amt * rate / 100;
    }

    public static void main(String[] args) {
        BankInterest b = new BankInterest();
        System.out.println(b.calculate(1000));
    }
}