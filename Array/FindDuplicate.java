import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        HashSet<Integer> set = new HashSet<>();
        
        System.out.print("Duplicate Elements: ");
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}

