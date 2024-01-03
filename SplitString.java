import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the String expression: ");
        String exp = br.readLine();
        if(exp.contains("+")) {
            String a[] = exp.split("\\+");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            System.out.println("output: Sum=" + (x + y));
        } else if (exp.contains("-")) {
            String a[] = exp.split("-");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            System.out.println("output: Difference="+(x-y));
        } else if (exp.contains("*")) {
            String a[] = exp.split("\\*");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            System.out.println("output: Product="+(x*y));
        } else if(exp.contains("/")){
            String a[] = exp.split("/");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            System.out.println("output: Quotient="+(x/y));
        } else{
            System.out.println("Invalid expression");
        }

        System.out.println("Enter a double value:");
        double d = Double.parseDouble(br.readLine());
        System.out.println(d);

        System.out.println("Enter a Integer value:");
        int e = Integer.parseInt(br.readLine());
        System.out.println(e);
    }
}