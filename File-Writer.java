//#In this, I have created a file writer program with the use of Finally block....


package exceptionhandlingtest;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyTest {
    public static void main(String[] args) throws Exception {
        FileWriter fw = null;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            {
                fw = new FileWriter("Finally2.txt");
                System.out.println("Enter String to be printed on file....");
                String s = b.readLine();
                fw.write(s);
                System.out.println("File completed Successfully...");
            }
        } catch (IOException ie) {
            System.out.println("IO Error Occurred....");
        }
        finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    System.out.println("Can't close file....");
                }
            }
        }
    }
}

