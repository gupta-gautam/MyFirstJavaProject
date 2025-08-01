import java.util.*;

public class CheckPalindromeInt {


    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
