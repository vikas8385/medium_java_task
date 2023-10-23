import java.util.Arrays;

public class Rotation {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int D = 2;

        rotateRight(arr, D);
 
        System.out.println("arr after rotation = " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRight(int[] arr, int D) {
        int N = arr.length;
        D = D % N;  

         
        reverse(arr, 0, N - D - 1);

       
        reverse(arr, N - D, N - 1);

         
        reverse(arr, 0, N - 1);
    }
}


