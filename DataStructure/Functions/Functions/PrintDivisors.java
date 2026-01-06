import java.util.*;

public class PrintDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int div = 1; div <= n; div++) {
            if (n % div == 0) {
                System.out.println(div);
            }
        }
        System.out.println();
    }
}
