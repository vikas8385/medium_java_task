import java.util.*; 
public class Median {
    public static void main(String[] args) {
        float  arr[] = { 7, 2, 5, 1, 9, 4 };
        Arrays.sort(arr);   
      //  float count = 0;
        float median =((arr[(arr.length-1)/2])+ (arr[(arr.length)/2]))/2;
         
        System.out.println(median);
    }
}
