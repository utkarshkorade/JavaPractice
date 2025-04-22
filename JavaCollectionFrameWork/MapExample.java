import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Using HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Apple", 3);  // Overwrites previous value
        System.out.println("HashMap: " + hashMap);

        // Using LinkedHashMap (maintains insertion order)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 4);
        linkedHashMap.put("Mango", 5);
        linkedHashMap.put("Apple", 6);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Using TreeMap (sorted by key)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Peach", 7);
        treeMap.put("Cherry", 8);
        treeMap.put("Apple", 9);
        System.out.println("TreeMap (sorted): " + treeMap);
    }
}
