public class Parity {
    public static void main(String[] args) {
        int n = 57;
        while(n>0){
            System.out.println(n&1);
            System.out.println(n&(n-1));
            n = n>>1;
        }
    }
}
