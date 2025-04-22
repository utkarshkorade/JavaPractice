import java.io.BufferedReader;
import java.io.*;
class CharInput{
    public static void main(String [] args) throws IOException{
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character:: ");
        char ch=(char) br.read();
        System.out.println("U enterd character::"+ch);

    }
}