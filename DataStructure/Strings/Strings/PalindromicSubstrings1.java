import java.util.*;

public class PalindromicSubstrings1 {

    // Function to check if a string is palindrome
    public static boolean isPalindrome(StringBuilder sb) {
        int i = 0;
        int j = sb.length() - 1;
        while (i <= j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Function to find and print all palindromic substrings using StringBuilder
    public static void solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                sb.append(str.charAt(j));
                if (isPalindrome(sb)) {
                    System.out.println(sb.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}
