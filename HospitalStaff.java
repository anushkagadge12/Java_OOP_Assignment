class Staff {
    void work() {}
}

class Doctor extends Staff {
    void work() { System.out.println("Treating patients"); }
}

public class HospitalStaff {
    public static void main(String[] args) {
        Staff s = new Doctor();
        s.work();
    }
}