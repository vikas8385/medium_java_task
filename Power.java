import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("number is ");
        }

        if (isPower(num)) {
            System.out.println(num + " is a power of two.");

        } else {
            System.out.println(num + " is not a power of two.");
        }
    }

    public static boolean isPower(int n) {

        if (n == 1) {
            return true;
        }

        else if (n % 2 != 0 || n == 0) {
            return false;
        }

        else {
            return isPower(n / 2);
        }

    }
}
