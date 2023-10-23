import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        String string = "Hello, World!";
        char given = 'H';

        Predicate<String> start = str -> str.startsWith(String.valueOf(given));

        boolean result = start.test(string);

        System.out.println("Sample Output: " + result);
    }
}
