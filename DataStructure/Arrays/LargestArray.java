import java.util.*;

public class LargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []nums = new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
            System.out.println(max);

    }
    }
