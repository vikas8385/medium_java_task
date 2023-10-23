import java.util.Arrays;;

public class Avgtemp {
    public static void main(String[] args) {
        int[] temp = { 25, 28, 21, 24, 27 };
        Arrays.sort(temp);

        int avg = 0;
        for (int i = 0; i < temp.length; i++) {
            avg += temp[i];
        }
        System.out.println("averge of the temp is:" + avg / temp.length);
        System.out.println("Higest temp is:" + temp[temp.length - 1]);
        System.out.println("lowest temp is:" + temp[0]);

    }
}
