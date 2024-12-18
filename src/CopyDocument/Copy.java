package CopyDocument;

import java.io.*;
public class Copy {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("C:\\Users\\UttamChamlingRai\\Desktop\\input.pdf");
            out = new FileWriter("C:\\Users\\UttamChamlingRai\\Desktop\\output.pdf");
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        finally {
            try{
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }}
            catch (IOException e) {
                System.out.println("Exception: " + e);
            }
        }

    }
}
