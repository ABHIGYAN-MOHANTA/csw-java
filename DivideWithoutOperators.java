public class DivideWithoutOperators {

    public static void main(String[] args) {
        int x = 20; // Replace with the numerator
        int y = 4;  // Replace with the denominator

        if (y == 0) {
            System.out.println("Error: Division by zero");
        } else {
            int result = divide(x, y);
            System.out.println(x + " / " + y + " = " + result);
        }
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int sign = ((x < 0) ^ (y < 0)) ? -1 : 1;

        x = Math.abs(x);
        y = Math.abs(y);

        int quotient = 0;

        while (x >= y) {
            x = subtract(x, y);
            quotient = add(quotient, 1);
        }

        return sign * quotient;
    }

    public static int subtract(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
