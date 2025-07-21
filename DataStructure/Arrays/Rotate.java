import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // Handle rotation count > size
        k = k % size;

        // Step 1: Reverse whole array
        reverse(num, 0, size - 1);

        // Step 2: Reverse first k elements
        reverse(num, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(num, k, size - 1);

        // Print rotated array
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }

    // Helper function to reverse part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
