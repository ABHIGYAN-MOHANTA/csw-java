import java.sql.Array;
import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n = 12345667;
        while(n != 0){
            int d = n%10;
            a[d]++;
            n = n/10;
        }
        System.out.println(Arrays.toString(a));
    }
}
