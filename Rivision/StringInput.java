import java.io.*;

public class StringInput {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter a stirng ::");
        String st= br.readLine();
        System.out.println("UR STRING IS ="+st);

    }
}
