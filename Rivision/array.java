class array{

    public static void main(String [] args){

        int [] arr={10,20,30,40,50};

        int sizeofarr=arr.length*4;
        int sum=0;

        for(int i=0;i<arr.length;i++){

            sum=sum+arr[i];

        System.out.print(arr[i]+" ");

        }
        System.out.println(" ");
        System.out.println("the sum of the array::"+sum);
        System.out.println("");
        System.out.println("the size of the array ::"+ sizeofarr);
    }
}
