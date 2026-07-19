import java.util.*;

public class Concatenate {

    public static long sumAndMultiply(int n) {
        long rv = 0;
        long ans = 0;
        long sum = 0;
        while (n > 0) {
            int dig = n % 10;

            if (dig != 0) {
                sum = sum + dig;
                rv = rv * 10 + dig;
            }
            n = n / 10;
        }
        while (rv > 0) {
            long digit = rv % 10;
            ans = ans * 10 + digit;
            rv = rv / 10;
        }
        return ans * sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        long ans = sumAndMultiply(x);
        System.out.println(ans);
    }
}
