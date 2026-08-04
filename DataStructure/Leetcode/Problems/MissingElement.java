import java.util.*;

public class MissingElement {
    public static List<Integer> missingElements(int [] nums){
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int nums[] = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        List<Integer> ans = missingElements(nums);
        System.out.println(ans);
    }
}
