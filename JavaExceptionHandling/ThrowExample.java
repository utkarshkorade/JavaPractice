public class ThrowExample {
    public static void main(String[] args) {
        validateAge(15); // This will throw an exception
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        System.out.println("Age is valid.");
    }
}

