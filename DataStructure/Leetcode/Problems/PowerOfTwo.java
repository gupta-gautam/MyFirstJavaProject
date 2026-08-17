import java.util.*;

public class PowerOfTwo {
    public static boolean powerTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return (n == 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    boolean ans = powerTwo(n);
        System.out.println(ans);
    }
}
