import java.util.*;

public class ReverseIntegerLong {

    public static int solution(int x) {

        long reverse = 0;
        while (x != 0) {
            int dig = x % 10;
            reverse = reverse * 10 + dig;
            x = x / 10;
        }
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reverse;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(solution(x));
    }
}

