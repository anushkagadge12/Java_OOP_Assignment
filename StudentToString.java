class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class StudentToString {
    public static void main(String[] args) {
        Student s = new Student(1, "Anushka");
        System.out.println(s);
    }
}