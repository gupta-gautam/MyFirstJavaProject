import java.util.*;

public class KadaneAlgorithm {
    public static int maxSubArray(int []nums){
        int current = nums[0];
        int max = nums[0];

        for(int i=1;i< nums.length;i++){
            current = Math.max(nums[i],current + nums[i]);
            max = Math.max(current,max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int nums[] = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }
}
