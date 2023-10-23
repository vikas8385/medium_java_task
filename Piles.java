import java.util.ArrayList;

import java.util.List;

public class Piles {
    public static void main(String[] args) {
        int n = 7;
        List<Integer> piles = new ArrayList<>();
        int currentStones = 2;
        piles.add(2);

        while (n > 0) {
            if (currentStones % 2 == 0 && n % 2 == 1) {
                currentStones += 2;
            }

            piles.add(currentStones);
            n -= currentStones;

        }

        System.out.println(piles);
    }
}
