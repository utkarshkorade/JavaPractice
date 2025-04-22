public class BubbleSort {
    public static void Sorting(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        printarray(arr);
    }
    public static void printarray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int []arr={9,5,4,2,7,1,8,3,0};
        System.out.println("Array Before sort::");
        printarray(arr);
        System.out.println("array After sort::");
        
        Sorting(arr);

    }
}
