
public class Reverse {
    public static void main(String[] args) {
        int n = 245;
        int num = n;
        boolean flag = false;
        int count = 0;
        if(n < 0){
            flag = true;
            n = n*-1;
        }
        int s = 0;
        while(n != 0){
            int d = n%10;
            s = s*10+d;
            n = n/10;

            if((d&1) == 0){
                count++;
            }
        }

        if(flag){
            s = s*-1;
        }
        System.out.println("Og num: "+num);
        System.out.println("Reversed num: "+s);

        System.out.println("is this palindrome: "+(s == num));
        System.out.println("no. of even digits is: "+count);
    }
}
