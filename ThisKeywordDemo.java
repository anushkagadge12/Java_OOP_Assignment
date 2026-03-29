public class ThisKeywordDemo {
    String name;
    double salary;

    ThisKeywordDemo(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ThisKeywordDemo e = new ThisKeywordDemo("Joy", 20000);
        System.out.println(e.name + " " + e.salary);
    }
}