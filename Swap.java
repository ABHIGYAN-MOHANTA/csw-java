public class Swap {
    public static void main(String[] args) {
        int n = 6;
        int i = 0, j = 2;
        int mask = (1<<j | 1 <<i);
        System.out.println(n^mask);
    }
}
