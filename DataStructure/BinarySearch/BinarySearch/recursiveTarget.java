import java.util.*;

public class recursiveTarget {

    public static int recBinarySearch(int[] arr, int tar, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;

            if (tar > arr[mid]) { // 2nd half
                return recBinarySearch(arr, tar, mid + 1, end);
            } else if (tar < arr[mid]) { // 1st half
                return recBinarySearch(arr, tar, st, mid - 1);
            } else { // mid => answer
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 3, 4, 5, 9, 12};
        int tar1 = 4;

        int result = recBinarySearch(arr1, tar1, 0, arr1.length - 1);

        System.out.println("Index of target: " + result);
    }
}