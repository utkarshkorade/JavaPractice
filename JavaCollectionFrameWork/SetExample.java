import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Using HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // Duplicate, will be ignored
        System.out.println("HashSet: " + hashSet);

        // Using TreeSet (sorted)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Apple");
        System.out.println("TreeSet (sorted): " + treeSet);
    }
}
