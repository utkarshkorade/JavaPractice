import java.util.*;

class HashSetExample{
  public static void main(String[] args) {
    
    HashSet<String> hs = new HashSet<>();

    hs.add("india");
    hs.add("bharat");
    hs.add("Gujarat"); 
    hs.clear();
    hs.add("aadesh");
    hs.add("aadesh");
    hs.remove("aadesh");
    for (String name : hs) {
        System.out.println(name);
    }
  }  
}
