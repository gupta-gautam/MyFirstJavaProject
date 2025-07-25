import java.util.*;

public class StringsBuilderCompression1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));
    }

    public static String compression1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}
