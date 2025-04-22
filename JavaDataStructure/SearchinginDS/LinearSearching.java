
import java.util.Scanner; 

public class LinearSearching {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={10,4,5,7,8,3,6,9,0};
        System.out.println("Enter a element you want to search");
        int search=sc.nextInt();
        boolean isfind=false;
        int index=0;

        for(int i=0;i<arr.length;i++){
            
            if(search == arr[i]){
                isfind=true;
                index=i;
            }
        }
        if(isfind){
            System.out.println("we find " + search +" in the array at index " + index);
        }else{
            System.out.println("we not find your element in the array");
        }

    }
}
