public class StackHeightLogN2 {
    public static double printPower(double x, int n) {
        long N = n;
        return myPow(x, N);
    }

    public static double myPow(double x, long n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / myPow(x, -n);
        double half = myPow(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        double ans = printPower(x, n);
        System.out.println(ans);
    }
}
