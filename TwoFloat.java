public class TwoFloat {
    public static void main(String[] args) {
        float d1 = 0.3f* 3.0f;
        float d2 = 0.9f;
        System.out.printf("%.20f",d1);
        System.out.println();
        System.out.println("d1 = "+d1+" d2 = "+d2);
        System.out.println(d1 == d2);
        System.out.println(Math.abs(d1-d2)<0.000001);
    }
}
