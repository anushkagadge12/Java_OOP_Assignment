import java.util.*;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = sc.nextLine();

        user = user.trim().toLowerCase();

        System.out.println("Cleaned Username: " + user);
    }
}