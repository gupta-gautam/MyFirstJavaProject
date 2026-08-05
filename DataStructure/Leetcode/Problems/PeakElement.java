import java.util.*;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int nums[] = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
}
