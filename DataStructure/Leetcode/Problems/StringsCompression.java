import java.util.*;

public class StringsCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));
    }

    public static String compression1(String str) {
        String s = " " + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                s += curr;
            }
        }
        return s;
    }
}