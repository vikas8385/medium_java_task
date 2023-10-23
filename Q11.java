import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        List<String> List1 = Arrays.asList("Red", "Blue", "Black", "White", "Pink");

        for (String str : List1) {
            List<Character> charList = new ArrayList<>();
            for (char ch : str.toCharArray()) {
                charList.add(ch);
            }

            System.out.print(charList);
        }

    }
}
