import java.util.*;

public class SingleNumber {
    public static int single(int nums[]) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int nums[] = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = single(nums);
        System.out.println(ans);
    }
}
