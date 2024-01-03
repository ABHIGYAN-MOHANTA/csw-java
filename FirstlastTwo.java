public class FirstlastTwo {
    public static void main(String[] args) {
        int a = 45678;
        int b = 4512;
        int f=0,s=0;
        while(a != 0){
            int d = a%10;
            s = f;
            f = d;
            a = a/10;
        }
        int firstTwoDigit = f*10+s;
        System.out.println(firstTwoDigit*100+b%100);
    }
}