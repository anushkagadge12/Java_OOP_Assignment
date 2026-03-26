public class EmployeeCount {
    static int count = 0;

    EmployeeCount() {
        count++;
    }

    public static void main(String[] args) {
        new EmployeeCount();
        new EmployeeCount();
        System.out.println(count);
    }
}