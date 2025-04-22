public class ReverseArray {
    public static void Reversearray(int []arr){
        int [] reverse=new int[arr.length];
        System.out.println("");
        System.out.println("this is the reverse array::");
        for(int i=0;i<arr.length;i++){
            reverse[i]=arr[arr.length-i-1];
            System.out.print(reverse[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        // Reversearray(arr);
        System.out.println("The first array::");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Reversearray(arr);
    }
}
