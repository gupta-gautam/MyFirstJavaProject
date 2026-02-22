import java.util.*;

public class StringHashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // if string present then
        // String ch  = String.valueOf(s.charAt(i));
        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println(mp.getOrDefault(c, 0));
        }
    }
}