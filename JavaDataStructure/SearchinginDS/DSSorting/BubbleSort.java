 
/* bubble sort is a sorting  algorithm in the data structure which sort the algorithm in the the following pattern:-

int arr[]={2,5,1,4,90,2};
it compare first  2 with 5 so if we want to sort acoording to acending order it comapre 2>5 so it is not then it moves forward or then it compare with 5 and 1 so this is true ,1<5 it swap 5 position to one and 1 position to 5
and so on for every element;
*/
public class BubbleSort {
    
    void printArray(int parr[]){
      
        for(int i=0;i<=parr.length-1; i++){

            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String []args){

        int arr[]={92,4,7,2,9,43,933,667};
        
        System.out.println("Array Before Sorted");
        printArray(arr[]);

        }
}
