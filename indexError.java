 
    import java.util.ArrayList;
import java.util.List;
public class indexError {
 
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

         
        myList.add(10);
        myList.add(20);
        myList.add(30);

 
        try {
            int index = 3; 
            int element = myList.get(index);  
            System.out.println("Element at index " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index is out of range. Exception message: " + e.getMessage());
        }

        
        System.out.println("Program continues...");
    }
}


