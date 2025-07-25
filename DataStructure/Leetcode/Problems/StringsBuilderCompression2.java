import java.util.*;

public class StringsBuilderCompression2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression2(str));
    }

    public static String compression2(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                sb.append(count);
                sb.append(curr);
                count = 1;
            }
        }
        sb.append(count);
        return sb.toString();
    }
}