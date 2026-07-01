import java.util.*;

public class MaxProductSubArray {

    public static int productSubArray(int []nums){

        int currentMax = nums[0];
        int currentMin = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] < 0){
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            if(currentMax * nums[i] > nums[i]){
                currentMax = currentMax * nums[i];
            }else{
                currentMax = nums[i];
            }

            if(currentMin * nums[i] < nums[i]){
                currentMin = currentMin * nums[i];
            }else{
                currentMin = nums[i];
            }

            if(currentMax > max){
                max = currentMax;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        int max = productSubArray(nums);
        System.out.println(max);
    }
}
