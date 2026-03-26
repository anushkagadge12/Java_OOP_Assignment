class Person2 {
    void role() { System.out.println("Person"); }
}

class Employee2 extends Person2 {
    void role() { System.out.println("Employee"); }
}

class Manager2 extends Employee2 {
    void role() { System.out.println("Manager"); }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager2 m = new Manager2();
        m.role();
    }
}