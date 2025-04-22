public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] FirstArray = {1, 2, 3, 4, 5,6,7,8,9,10};
        int[] CopyArray = new int[FirstArray.length];

        System.out.println("This is the first array::");

        for (int i = 0; i < FirstArray.length; i++) {
            CopyArray[i] = FirstArray[i];
            System.out.print(FirstArray[i]+" ");
        }

        // Print the elements of the copy array
        System.out.println("");
        System.out.println("This is the copy array::");
        for (int i=0;i<CopyArray.length ;i++) {
            System.out.print(CopyArray[i] + " ");
        }
    }
}
