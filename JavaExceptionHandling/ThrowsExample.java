import java.io.*;

 class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistentfile.txt"); // Might throw FileNotFoundException
        file.read();
    }
}
