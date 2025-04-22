public class Calculator {
    // Overloaded methods for different parameter types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Integer addition: " + calc.add(2, 3));     // 5
        System.out.println("Double addition: " + calc.add(2.5, 3.5));  // 6.0
    }
}
