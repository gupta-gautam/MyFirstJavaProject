import java.util.*;

public class RotateByOne {
    public static int[] rotateByOne(int[] nums){
        reverse(nums,0,nums.length-1);
        reverse(nums,0,nums.length-2);
        return nums;
    }
    public static void reverse(int []nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int nums[] = new int[x];

        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        int[] ans = rotateByOne(nums);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
