
// binary array is only used for sorted array .not for unsorted. so define sorted array  first-
public class BinarySearch {
    public static void main(String [] args){
        int arr[]={9,20,30,40,50,60,80,90};
        int left=0;
        int search=9;
        int right=arr.length-1;

        while(left<=right){

           int mid= (left + right)/2;

            if(arr[mid] == search){
                System.out.println("YES Found "+ search+ " at "+ mid);
            }
            if(arr[mid] < search){
                left=mid+1;
            }else{
                right = mid-1;
            }
        }
    }
    
}
