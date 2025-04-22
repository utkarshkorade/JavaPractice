public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = str.replaceAll("\\s", "");
        
        System.out.println("String without whitespaces: " + result);
    }
}
