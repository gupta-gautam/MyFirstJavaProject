import java.util.*;

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {


            if (current < 0) {
                current = nums[i];

            } else {
                current += nums[i];
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int max = maxSubArray(nums);
        System.out.println(max);
    }
}
