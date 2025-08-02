import java.util.*;

public class ASCIDiffOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }

    // in void in last we wrote sout(sb.toString());
    // in string we wrote rturn sb.toString();
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            int diff = curr - prev;
            sb.append(diff);
            sb.append(curr);
        }
        System.out.println(sb.toString());
    }
}
