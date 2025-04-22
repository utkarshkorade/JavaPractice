public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 10; // ArrayIndexOutOfBoundsException
            int data = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}

