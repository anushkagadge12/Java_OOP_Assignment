interface Bank {
    int getInterestRate();
}

class SBI implements Bank {
    public int getInterestRate() { return 5; }
}

class HDFC implements Bank {
    public int getInterestRate() { return 6; }
}

public class BankInterfaceDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println(b1.getInterestRate());
        System.out.println(b2.getInterestRate());
    }
}