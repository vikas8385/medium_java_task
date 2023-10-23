public class Pair {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int k = 6;
        int count = 0;
        for (int i = 0; i < arr1.length / 2; i++) {
            for (int j = 1; j < arr1.length; j++) {
                if ((arr1[i] + arr1[j]) == k) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
}
