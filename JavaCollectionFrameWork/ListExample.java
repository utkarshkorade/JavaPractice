import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");  // Duplicates allowed
        System.out.println("ArrayList: " + arrayList);

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Orange");
        linkedList.add("Mango");
        linkedList.add("Orange");  // Duplicates allowed
        System.out.println("LinkedList: " + linkedList);
    }
}
