import java.util.*;

public class Permutations {
    public static void solution1(String str) {
        int n = str.length();
        int f = factorial(n);
        for (int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder();
            int temp = i;
            for (int div = n; div >= 1; div--) {
                int q = temp / div;
                int r = temp % div;
                System.out.println(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }

            System.out.println();
        }
    }

    public static int factorial(int n) {
        int val = 1;
        for (int i = 2; i <= n; i++) {
            val *= i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution1(str);
    }
}
