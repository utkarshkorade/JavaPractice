public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int data = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
