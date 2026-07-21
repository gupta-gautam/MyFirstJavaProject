import java.util.*;

public class RemoveElement {
    public static int removeElement(int []nums,int val){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int nums[] = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int val = sc.nextInt();

        int num = removeElement(nums,val);

        System.out.println(num);
    }
}
