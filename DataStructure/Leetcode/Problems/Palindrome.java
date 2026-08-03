import java.util.*;

public  class Palindrome {

    public static boolean isPalindrome(String s,int left,int right){

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean validPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left<=right){
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);

            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        boolean ans = validPalindrome(x);
        System.out.println(ans);
    }
}


