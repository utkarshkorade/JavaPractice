public class SecondSmallestSingleLoopNoMaxValue {
    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return a sentinel value indicating error
        }

        int smallest = arr[0];
        int secondSmallest = arr[1]; // Assume the second element is initially the second smallest

        if (smallest > secondSmallest) {
            int temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 2, 3 };
        int secondSmallest = findSecondSmallest(numbers);
        if (secondSmallest != -1) {
            System.out.println("Second Smallest Number: " + secondSmallest);  // Output: Second Smallest Number: 3
        } else {
            System.out.println("No second smallest element found.");
        }
    }
}
