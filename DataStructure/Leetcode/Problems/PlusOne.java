import java.util.*;

public class PlusOne {
    public static int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int ans[] = new int[nums.length + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int nums[] = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = plusOne(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
