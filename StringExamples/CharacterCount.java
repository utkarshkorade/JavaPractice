import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Character Counts: " + charCountMap);
    }
}
