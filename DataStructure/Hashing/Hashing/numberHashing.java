import java.util.*;

public class numberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++; // increment frequency
        }

        // queries
        int q = sc.nextInt();
        for(int i=0;i<q;i++)while (q-- > 0) {  // same as while => for(int i=0;i<q;i++)
            int num = sc.nextInt();
            System.out.println(hash[num]); // fetch frequency
        }
    }
}
