public class Resort {
    int Rno, Days;
    String Name;
    float Charges;

    float Compute() {
        float amt = Days * Charges;
        if (amt > 11000) amt *= 1.02;
        return amt;
    }

    void Getinfo(int r, String n, float c, int d) {
        Rno = r; Name = n; Charges = c; Days = d;
    }

    void DispInfo() {
        System.out.println(Rno + " " + Name + " " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(101, "Anushka", 2000, 6);
        r.DispInfo();
    }
}