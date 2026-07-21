import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int []nums){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int nums[] = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int num = removeDuplicates(nums);
        System.out.println(num);
    }
}
