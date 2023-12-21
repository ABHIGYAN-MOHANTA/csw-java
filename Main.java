import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        int a = 5;
        Integer b = Integer.valueOf(a);
        System.out.println("integer to Integer object: "+b);

        float c = 5.2f;
        Float d = Float.valueOf(c);
        System.out.println("float to Float object: "+d);

        double e = 2.3d;
        Double f = Double.valueOf(e);
        System.out.println("double to Double object: "+f);

        boolean g = true;
        Boolean h = Boolean.valueOf(g);
        System.out.println("boolean to Boolean object: "+h);


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("enter int value");
        int i = Integer.parseInt(br.readLine());
        System.out.println("String input to int: "+ i);

        System.out.println("enter float value");
        Float j =Float.parseFloat(br.readLine());
        System.out.println("string input to Float Object: "+j);

        System.out.println("enter double value");
        Double k =Double.parseDouble(br.readLine());
        System.out.println("String input to Double Object: "+k);

        System.out.println("enter boolean value");
        Boolean l = Boolean.parseBoolean(br.readLine());
        System.out.println("String input to Boolean Object: "+l);
    }
}