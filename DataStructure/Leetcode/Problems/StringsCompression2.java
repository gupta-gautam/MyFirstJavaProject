import java.util.*;

public class StringsCompression2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression2(str));
    }

    public static String compression2(String str) {
        String s = " " + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {

                s += count;
                s += curr;
                count = 1;
            }
        }
        s += count;
        return s;
    }
}
