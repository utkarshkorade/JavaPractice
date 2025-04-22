 
/* bubble sort is a sorting  algorithm in the data structure which sort the algorithm in the the following pattern:-

int arr[]={2,5,1,4,90,2};
it compare first  2 with 5 so if we want to sort acoording to acending order it comapre 2>5 so it is not then it moves forward or then it compare with 5 and 1 so this is true ,1<5 it swap 5 position to one and 1 position to 5
and so on for every element;
*/
public class BubbleSort {
    
   public static void printArray(int arr[]){
      
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i] + " ");
        }
    }
    public static void main(String []args){

        int arr[]={92,4,7,2,9,43,933,667};
        
        System.out.println("Array Before Sorted");
        printArray(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    //swap 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println();
        System.out.println("Array After sorted");
        printArray(arr);

        }
}
