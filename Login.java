import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "user123";
        String password = "password123";
        int maxAttempts = 3;
        int remainingAttempts = maxAttempts;

        System.out.println("Welcome to the Login Page");

        while (remainingAttempts > 0) {
            System.out.print("Enter username: ");
            String Username = scanner.nextLine();

            System.out.print("Enter  password: ");
            String Password = scanner.nextLine();

            if (Username.equals(username) && Password.equals(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                remainingAttempts--;
                System.out.println("Incorrect username or password. Remaining attempts: " + remainingAttempts);
                if (remainingAttempts > 0) {
                    System.out.println("Please try again.");
                } else {
                    System.out.println("You have exceeded the maximum number of attempts. ");
                }
            }
        }

    }

}
