import java.util.ArrayList;

public class Common_Element {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    list.add(arr1[i]);
                }
            }
        }
        System.out.print(list);
    }
}
