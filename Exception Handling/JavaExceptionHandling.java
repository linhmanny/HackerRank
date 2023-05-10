import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class JavaExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int x,y;
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.getClass().getName() == "java.lang.ArithmeticException" ? e : e.getClass().getName());
        }
    }
}



