abstract class Employee {
    abstract void calculateBonus();
}

class Manager extends Employee {
    void calculateBonus() {
        System.out.println("20% Bonus");
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.calculateBonus();
    }
}