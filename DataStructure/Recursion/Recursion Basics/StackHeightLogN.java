public class StackHeightLogN {
    public static double printPower(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        if (n == Long.MIN_VALUE) {
            // Avoid overflow by adjusting n before negating
            return 1 / (x * printPower(x, -(n + 1)));
        }
        if (n < 0) {
            return 1 / printPower(x, -n);
        }
        double halfPower = printPower(x, n / 2);
        // if n is even
        if (n % 2 == 0) {
            return halfPower * halfPower;
        }
        // if n is odd
        else {
            return halfPower * halfPower * x;
        }
    }

    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        double ans = printPower(x, n);
        System.out.println(ans);
    }
}
