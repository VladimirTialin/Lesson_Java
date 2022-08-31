import java.io.*;
public class ReadToFile {
    public static void main(String[] args) throws Exception {
        FileReader filer = new FileReader("file.txt");
        int c;
        while ((c = filer.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    } } 
