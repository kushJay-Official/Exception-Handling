//Recover and Continue Mechanism

package exceptionhandlingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestException {
    public static void main(String []args)throws Exception{
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            try {
                System.out.println("Enter Number");
                int i = Integer.parseInt(b.readLine());
                System.out.println(i);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid Input....");
            }
        }
    }
}
