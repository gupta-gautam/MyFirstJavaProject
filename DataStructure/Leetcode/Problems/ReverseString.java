import java.util.*;

public class ReverseString {
    public static char[] reverseString(char []s){
int left =0;
int right = s.length-1;
while(left < right){
    char temp = s[left];
    s[left] = s[right];
    s[right] = temp;

    left++;
    right--;
}
return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        char[] nums = new char[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.next().charAt(0);
        }
        char[] ans = reverseString(nums);
        System.out.println(ans);
    }
}
