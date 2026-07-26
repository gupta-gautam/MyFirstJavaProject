import java.util.*;

public class consecutiveCharacters {
    public static int Char(String s) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        int ans = Char(x);
        System.out.println(ans);
    }
}
