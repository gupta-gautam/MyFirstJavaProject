import java.util.*;

public class AddDigits {
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                int dig = num % 10;
                sum += dig;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ans = addDigits(x);
        System.out.println(ans);
    }
}
