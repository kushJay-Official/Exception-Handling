//Catching Multiple exceptions through Multiple Catches

package exceptionhandlingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultipleCatchExcptn {
    public static void main(String []args)throws Exception{
        int i,j;
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                System.out.print("Enter First Value....");
                i = Integer.parseInt(b.readLine());
                System.out.print("Enter Second Value....");
                j = Integer.parseInt(b.readLine());
                System.out.printf("You have entered: %d%d\n", i, j);
                System.out.printf("Result: %d\n", i / j);
                break;
            } catch (NumberFormatException ne) {
                System.out.println("Incorrect Input...");
            } catch (ArithmeticException ae) {
                System.out.println("Second Value Should be positive....");
            } catch (Exception e) {
                System.out.println("Unknown Error...");
            }
        }
    }
}
