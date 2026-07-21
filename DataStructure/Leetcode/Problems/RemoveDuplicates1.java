import java.util.*;

public class RemoveDuplicates1 {
    public static int removeDuplicates1(int[] nums) {
        int i = 1;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int nums[] = new int[x];

        for (int i = 01 ; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int number = removeDuplicates1(nums);
        System.out.println(number);
    }
}
