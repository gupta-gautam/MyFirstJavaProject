import java.util.*;

public class ValidAnagram {
    public static boolean valid(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        int count[] = new int[26];
        for (int i = 0; i < x.length(); i++) {
            count[x.charAt(i) - 'a']++;
        }
        for (int i = 0; i < y.length(); i++) {
            count[y.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        String y = sc.next();

        boolean ans = valid(x, y);
        System.out.println(ans);
    }
}
