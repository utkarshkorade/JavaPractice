import java.io.IOException;
import java.io.*;
public class IntInput {
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number");
        int number= Integer.parseInt(br.readLine());
        System.out.println("UR Number is ="+number);

    }   
}
